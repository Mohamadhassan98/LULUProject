package LULU;

import java.util.LinkedList;
import java.util.ResourceBundle;

class Tree
{
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("StringBundle");
    private final Node root = new Node(new GeneralScope());

    public GeneralScope getGeneralScope()
    {
        return (GeneralScope) root.getScope();
    }

    public Node getRoot()
    {
        return root;
    }

    public abstract static class Scope
    {
        private final String name;
        private final LinkedList<Symbol> symbols = new LinkedList<>();
        private int size;
        private int relativeLine;
        //TODO("May be useless, symbols.index may be used instead.")

        Scope(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public int getSize()
        {
            return size;
        }

        private void addSize(int size)
        {
            this.size += size;
        }

        public void addSymbol(String name, int size, Type type, boolean isConst, boolean isPrimitive)
        {
            if (symbols.stream().anyMatch(symbol -> symbol.getName().equals(name)))
            {
//                TODO("Multiple Messages for duplicate variables and methods")
                throw new DuplicateIdException("Id already gathered: " + name);
            }
            symbols.add(isPrimitive ? new PrimitiveSymbol(name, size, type, relativeLine, isConst) : new UserDefinedSymbol(name, size, type, relativeLine, isConst));
            relativeLine++;
            addSize(isPrimitive ? type.getSize() : size);
        }

    }

    static class FunctionScope extends Scope
    {
        FunctionScope(String name)
        {
            super(name);
        }

//    @Override
//    public void addScope(ScopeType scope, String name)
//    {
//        if (scope == ScopeType.ConditionalScope)
//        {
//            symbols.add(new ConditionalScope(name));
//        }
//        else
//        {
//            throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
//        }
//    }

    }

    static class ConditionalScope extends Scope
    {
        ConditionalScope(String name)
        {
            super(name);
        }

//    @Override
//    public void addScope(ScopeType scope, String name)
//    {
//        if (scope == ScopeType.ConditionalScope)
//        {
//            symbols.add(new ConditionalScope(name));
//        }
//        else
//        {
//            throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
//        }
//    }
    }

    static class DeclareScope extends Scope
    {
        DeclareScope()
        {
            super("Declare");
        }

//    @Override
//    public void addScope(ScopeType scope, String name)
//    {
//        throw new IllegalArgumentException("Defining Scope in Declare Scope is invalid");
//    }

    }

    static class TypeScope extends Scope
    {
        TypeScope(String name)
        {
            super(name);
        }

//    @Override
//    public void addScope(ScopeType scope, String name)
//    {
//        if (scope == ScopeType.FunctionScope)
//        {
//            symbols.add(new FunctionScope(name));
//        }
//        else
//        {
//            throw new IllegalArgumentException("Can't add Scope " + scope.name() + " in Type Scope");
//        }
//    }
    }

    static class GeneralScope extends Scope
    {
        GeneralScope()
        {
            super(resourceBundle.getString("general"));
        }

        @Override
        public void addSymbol(String name, int size, Type type, boolean isConst, boolean isPrimitive)
        {
            throw new IllegalCallerException("General Scopes have no variables");
        }
//    @Override
//    public void addScope(ScopeType scope, String name)
//    {
//        switch (scope)
//        {
//            case TypeScope:
//                symbols.add(new TypeScope(name));
//                break;
//            case DeclareScope:
//                symbols.add(new DeclareScope());
//                break;
//            case FunctionScope:
//                symbols.add(new FunctionScope(name));
//                break;
//            default:
//                throw new IllegalArgumentException("Defining Conditional Scope in General Scope is invalid");
//        }
//
//    }
    }

    public class Node
    {
        private final LinkedList<Node> children = new LinkedList<>();
        private final Node parent;
        private final Scope scope;

        Node(Scope data, Node parent)
        {
            scope = data;
            this.parent = parent;
        }

        private Node(Scope data)
        {
            this(data, null);
        }

        public void addChild(Scope data)
        {
            Node node = new Node(data, this);
            children.add(node);
        }

        public Node getParent()
        {
            return parent;
        }

        public Node getChild(int index)
        {
            return children.get(index);
        }

        public Scope getScope()
        {
            return scope;
        }
    }

}