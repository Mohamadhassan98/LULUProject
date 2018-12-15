import java.util.LinkedList;

public abstract class Scope
{
    private final String name;
    private int size;
    final LinkedList<Scope> innerScopes = new LinkedList<>();

    Scope(String name, int size)
    {
        this.name = name;
        this.size = size;
    }

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public abstract void addScope(ScopeType scope, String name, int size);
//    {
//        switch (scope)
//        {
//            case TypeScope:
//                innerScopes.add()
//        }
//    }
}

class FunctionScope extends Scope
{
    FunctionScope(String name, int size)
    {
        super(name, size);
    }

    @Override
    public void addScope(ScopeType scope, String name, int size)
    {
        if (scope == ScopeType.ConditionalScope)
        {
            innerScopes.add(new ConditionalScope(name, size));
        }
        else
        {
            throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
        }
    }

}

class ConditionalScope extends Scope
{
    ConditionalScope(String name, int size)
    {
        super(name, size);
    }

    @Override
    public void addScope(ScopeType scope, String name, int size)
    {
        if (scope == ScopeType.ConditionalScope)
        {
            innerScopes.add(new ConditionalScope(name, size));
        }
        else
        {
            throw new IllegalArgumentException("Can't add non-conditional Scope in this Scope");
        }
    }
}

class DeclareScope extends Scope
{
    DeclareScope(int size)
    {
        super("Declare", size);
    }

    @Override
    public void addScope(ScopeType scope, String name, int size)
    {
        throw new IllegalArgumentException("Defining Scope in Declare Scope is invalid");
    }

}

class TypeScope extends Scope
{
    TypeScope(String name, int size)
    {
        super(name, size);
    }

    @Override
    public void addScope(ScopeType scope, String name, int size)
    {
        if (scope == ScopeType.FunctionScope)
        {
            innerScopes.add(new FunctionScope(name, size));
        }
        else
        {
            throw new IllegalArgumentException("Can't add Scope " + scope.name() + " in Type Scope");
        }
    }
}

class GeneralScope extends Scope
{
    GeneralScope(int size)
    {
        super("General", size);
    }

    @Override
    public void addScope(ScopeType scope, String name, int size)
    {
        switch (scope)
        {
            case TypeScope:
                innerScopes.add(new TypeScope(name, size));
                break;
            case DeclareScope:
                innerScopes.add(new DeclareScope(size));
                break;
            case FunctionScope:
                innerScopes.add(new FunctionScope(name, size));
                break;
            default:
                throw new IllegalArgumentException("Defining Conditional Scope in General Scope is invalid");
        }

    }
}

enum ScopeType
{
    FunctionScope, DeclareScope, TypeScope, ConditionalScope
}

