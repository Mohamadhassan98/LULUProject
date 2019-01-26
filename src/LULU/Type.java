package LULU;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.ResourceBundle;

abstract class Type
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private static final PrimitiveType Int = new PrimitiveType(resourceBundle.getString("int"), 32);
    private static final PrimitiveType Float = new PrimitiveType(resourceBundle.getString("float"), 64);
    private static final PrimitiveType Bool = new PrimitiveType(resourceBundle.getString("bool"), 1);
    private static final PrimitiveType String = new PrimitiveType(resourceBundle.getString("string"), 32);
    private final String Name;
    private int Size;
    protected String toString;

    Type(String name, int size)
    {
        Name = name;
        toString = "lulu." + name;
        Size = size;
    }

    public static PrimitiveType Int()
    {
        return Int;
    }

    public static PrimitiveType Bool()
    {
        return Bool;
    }

    public static PrimitiveType Float()
    {
        return Float;
    }

    public static PrimitiveType String()
    {
        return String;
    }

    public boolean isPrimitive()
    {
        return this instanceof PrimitiveType;
    }

    String getName()
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

    public void addTypeSize(Type t)
    {
        Size += t.Size;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass()))
        {
            return false;
        }
        Type type = (Type) o;
        return Objects.equals(Name, type.Name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Name);
    }

    public java.lang.String getToString()
    {
        return toString;
    }

    static class PrimitiveType extends Type
    {
        PrimitiveType(String name, int size)
        {
            super(name, size);
        }

        @Override
        public String toString()
        {
            return "type " + getName();
        }
    }
}

class Array extends Type
{
    private final Type type;
    private final int Length;

    Array(@NotNull Type t, int length)
    {
        super("Array<" + t.getName() + '>', length * t.getSize());
        Length = length;
        toString = "lulu.Array<" + toString + '>';
        type = t;
    }

    public Type getType()
    {
        return type;
    }

    public int getLength()
    {
        return Length;
    }

    @Override
    public String toString()
    {
        return "type " + getToString();
    }
}

class UserDefinedType extends Type
{
    UserDefinedType(String name)
    {
        super(name, 0);
    }

    @Override
    public String toString()
    {
        return "type " + getToString();
    }
}

class ArraySignature extends Type
{
    private final int Dimension;
    private final Type type;

    ArraySignature(Type t, int dimension)
    {
        super("Array<" + t.getName() + ", " + dimension + '>', 4);
        Dimension = dimension;
        type = t;
    }

    public int getDimension()
    {
        return Dimension;
    }

    public Type getType()
    {
        return type;
    }

    public String toString()
    {
        return "Abstract type " + type.getToString();
    }
}
