package LULU;

import java.util.LinkedList;
import java.util.ResourceBundle;

enum ScopeType
{
    GeneralScope, ConditionalScope, DeclareScope, TypeScope, FunctionScope
}

class Tree
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private final Node root = new Node(new GlobalScope());

    GlobalScope getGlobalScope()
    {
        return (GlobalScope) root.getScope();
    }

    Node getRoot()
    {
        return root;
    }

    void addChild(Node node, ScopeType type, String name)
    {
        node.addChild(type, name);
    }

    public abstract static class Scope
    {
        private final String Name;
        private final ScopeType scopeType;

        private final LinkedList<Symbol> symbols = new LinkedList<>();
        private int Size;
        /**
         * TODO("May be useless, symbols.index may be used instead.")
         */
        private int offset;

        Scope(String name, ScopeType type)
        {
            Name = name;
            scopeType = type;
        }

        LinkedList<Symbol> getSymbols()
        {
            return symbols;
        }

        ScopeType getScopeType()
        {
            return scopeType;
        }

        public String getName()
        {
            return Name;
        }

        public int getSize()
        {
            return Size;
        }

        private void addSize(int size)
        {
            Size += size;
        }

        public void addSymbol(String name, int size, Type type, boolean isConst, boolean isPrimitive)
        {
            if (symbols.stream().anyMatch(symbol -> symbol.getName().equals(name)))
            {
//                TODO("Multiple Messages for duplicate variables and methods")
                throw new DuplicateIdException("Id already gathered: " + name);
            }
            symbols.add(isPrimitive ? new PrimitiveSymbol(name, type, offset, isConst) : new UserDefinedSymbol(name, type, offset, isConst));
            offset++;
            addSize(isPrimitive ? type.getSize() : size);
        }

        public void addSymbol(Symbol symbol)
        {
            symbols.add(symbol);
        }
    }

    static class FunctionScope extends Scope
    {
        FunctionScope(String name)
        {
            super(name, ScopeType.FunctionScope);
        }
    }

    static class ConditionalScope extends Scope
    {
        ConditionalScope(String name)
        {
            super(name, ScopeType.ConditionalScope);
        }
    }

    static class DeclareScope extends Scope
    {
        private final LinkedList<Type> types = new LinkedList<>()
        {{
            add(Type.Float());
            add(Type.Bool());
            add(Type.Int());
            add(Type.String());
        }};

        private final LinkedList<FunctionSignature> functionSignatures = new LinkedList<>();

        DeclareScope()
        {
            super(resourceBundle.getString("declare"), ScopeType.DeclareScope);
        }

        LinkedList<Type> getTypes()
        {
            return types;
        }

        void addType(UserDefinedType type)
        {
            types.add(type);
        }

        void addFunctionSignature(FunctionSignature fS)
        {
            if (functionSignatures.contains(fS))
            {
                throw new CompileError("Function already defined");
            }
//            System.out.println(functionSignatures.stream().anyMatch(functionSignature -> functionSignature.equals(fS)));
//            for (FunctionSignature functionSignature : functionSignatures)
//            {
//                if (functionSignature.equals(fS))
//                {
//                    throw new CompileError("Function already defined");
//                }
//            }
            functionSignatures.add(fS);
        }

        LinkedList<FunctionSignature> getFunctionSignatures()
        {
            return functionSignatures;
        }
    }

    static class TypeScope extends Scope
    {
        TypeScope(String name)
        {
            super(name, ScopeType.TypeScope);
        }
    }

    static class GlobalScope extends Scope
    {
        private final LinkedList<Type> types = new LinkedList<>()
        {{
            add(Type.Bool());
            add(Type.Int());
            add(Type.String());
            add(Type.Float());
        }};

        @Override
        public void addSymbol(String name, int size, Type type, boolean isConst, boolean isPrimitive)
        {
            throw new IllegalCallerException("General Scopes have no variables");
        }

        private final LinkedList<FunctionSignature> functionSignatures = new LinkedList<>();

        GlobalScope()
        {
            super(resourceBundle.getString("global"), ScopeType.GeneralScope);
        }

        LinkedList<Type> getTypes()
        {
            return types;
        }

        public LinkedList<FunctionSignature> getFunctionSignatures()
        {
            return functionSignatures;
        }

        public void addType(UserDefinedType type)
        {
            types.add(type);
            super.offset++;
        }
    }

    public class Node
    {
        private final LinkedList<Node> children = new LinkedList<>();
        private final LinkedList<CompileError> errors = new LinkedList<>();
        private final Node Parent;
        private final Scope scope;

        Node(Scope data, Node parent)
        {
            scope = data;
            Parent = parent;
        }

        private Node(Scope data)
        {
            this(data, null);
        }

        void throwError(CompileError e)
        {
            errors.add(e);
        }

        LinkedList<CompileError> getErrors()
        {
            return errors;
        }
        void addChild(ScopeType type, String name)
        {
            switch (scope.getScopeType())
            {
                case TypeScope:
                    if (type == ScopeType.FunctionScope)
                    {
                        children.add(new Node(new FunctionScope(name), this));
                    }
                    else
                    {
                        throw new IllegalArgumentException("Can't add Scope " + name + " in Type Scope");
                    }
                    break;
                case DeclareScope:
                    throw new IllegalArgumentException("Defining Scope in Declare Scope is invalid");
                case GeneralScope:
                    switch (type)
                    {
                        case TypeScope:
                            children.add(new Node(new TypeScope(name), this));
                            break;
                        case DeclareScope:
                            children.add(new Node(new DeclareScope(), this));
                            break;
                        case FunctionScope:
                            children.add(new Node(new FunctionScope(name), this));
                            break;
                        default:
                            throw new IllegalArgumentException("Defining Conditional Scope in General Scope is invalid");
                    }
                    break;
                case FunctionScope:
                    if (type == ScopeType.ConditionalScope)
                    {
                        children.add(new Node(new ConditionalScope(name), this));
                    }
                    else
                    {
                        throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
                    }
                    break;
                case ConditionalScope:
                    if (type == ScopeType.ConditionalScope)
                    {
                        children.add(new Node(new ConditionalScope(name), this));
                    }
                    else
                    {
                        throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
                    }
                    break;
            }
            scope.offset++;
        }

        public Node getParent()
        {
            return Parent;
        }

        Node getChild(int index)
        {
            return children.get(index);
        }

        Scope getScope()
        {
            return scope;
        }
    }

}