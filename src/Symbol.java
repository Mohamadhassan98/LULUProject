public abstract class Symbol
{
    private final String Name;
    private final int Size;
    private final Type type;
    private int pointer;

    public Symbol(String name, int size, Type type, int pointer)
    {
        Name = name;
        Size = size;
        this.type = type;
        this.pointer = pointer;
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
}

class PrimitiveSymbol extends Symbol
{
    PrimitiveSymbol(String name, int size, Type type, int pointer)
    {
        super(name, size, type, pointer);
    }
}

class UserDefinedSymbol extends Symbol
{
    private int objectSize;

    UserDefinedSymbol(String name, int size, Type type, int pointer, int objectSize)
    {
        super(name, size, type, pointer);
        this.objectSize = objectSize;
    }

    public int getObjectSize()
    {
        return objectSize;
    }


}


