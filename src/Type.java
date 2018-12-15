abstract class Type
{
    private final String Name;
    private int Size;

    Type(String name, int Size)
    {
        Name = name;
        this.Size = Size;
    }

    public String getName()
    {
        return Name;
    }

    public int getSize()
    {
        return Size;
    }

    public void setSize(int size)
    {
        Size = size;
    }
}

class Array extends Type
{
    private final Type type;
    private final int length;
    Array(Type type, int length, String name, int Size)
    {
        super(name, Size);
        this.length=length;
        this.type = type;
    }

    public Type getType()
    {
        return type;
    }

    public int getLength()
    {
        return length;
    }


}

class PrimitiveType extends Type
{
    PrimitiveType(String name, int Size)
    {
        super(name, Size);
    }
}

class StringType extends Type
{
    StringType()
    {
        super("StringType", 4);
    }
}

class UserDefinedType extends Type
{
    UserDefinedType(String name)
    {
        super(name, 4);
    }
}
