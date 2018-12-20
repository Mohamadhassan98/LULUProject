package LULU;

public abstract class Symbol
{
    private final String Name;
    private final int Size;
    private final Type type;
    private final boolean isConst;
    private int pointer;

    Symbol(String name, int size, Type type, int pointer, boolean isConst)
    {
        Name = name;
        Size = size;
        this.type = type;
        this.pointer = pointer;
        this.isConst = isConst;
    }

    public String getName()
    {
        return Name;
    }

    public int getSize()
    {
        return Size;
    }

    public Type getType()
    {
        return type;
    }

    public int getPointer()
    {
        return pointer;
    }

    public void setPointer(int pointer)
    {
        this.pointer = pointer;
    }

    public boolean isConst()
    {
        return isConst;
    }
}

class PrimitiveSymbol extends Symbol
{
    PrimitiveSymbol(String name, int size, Type type, int pointer, boolean isConst)
    {
        super(name, size, type, pointer, isConst);
    }
}

class UserDefinedSymbol extends Symbol
{
    private int objectSize;

    UserDefinedSymbol(String name, int size, Type type, int pointer, boolean isConst)
    {
        super(name, size, type, pointer, isConst);
    }

    public int getObjectSize()
    {
        return objectSize;
    }

    public void addObjectSize(int objectSize)
    {
        this.objectSize += objectSize;
    }
}

class FunctionSignature extends Symbol
{
    private final Symbol[] inputParameters, returnParameters;

    FunctionSignature(String name, int size, Type type, int pointer, Symbol[] returnTypes, Symbol[] inputTypes)
    {
        super(name, size, type, pointer, false);
        inputParameters = inputTypes;
        returnParameters = returnTypes;
    }

    public Symbol[] getInputParameters()
    {
        return inputParameters;
    }

    public Symbol[] getReturnParameters()
    {
        return returnParameters;
    }
}


