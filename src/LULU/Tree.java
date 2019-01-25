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

    public GlobalScope getGlobalScope()
    {
        return (GlobalScope) root.getScope();
    }

    public Node getRoot()
    {
        return root;
    }

    public void addChild(Node node, ScopeType type, String name)
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

        public LinkedList<Symbol> getSymbols()
        {
            return symbols;
        }

        public ScopeType getScopeType()
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

        DeclareScope()
        {
            super(resourceBundle.getString("declare"), ScopeType.DeclareScope);
        }

        public LinkedList<Type> getTypes()
        {
            return types;
        }

        public void addType(UserDefinedType type)
        {
            types.add(type);
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

        public LinkedList<Type> getTypes()
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

        public Node getChild(int index)
        {
            return children.get(index);
        }

        Scope getScope()
        {
            return scope;
        }
    }

}