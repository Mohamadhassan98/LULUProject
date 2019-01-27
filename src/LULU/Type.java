package LULU;

import LULU.Lulu2Parser.TypeEnum;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Objects;
import java.util.ResourceBundle;

@SuppressWarnings("Duplicates")
abstract class Type
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private static final PrimitiveType Int = new PrimitiveType(resourceBundle.getString("int"), 32, TypeEnum.Int);
    private static final PrimitiveType Float = new PrimitiveType(resourceBundle.getString("float"), 64, TypeEnum.Float);
    private static final PrimitiveType Bool = new PrimitiveType(resourceBundle.getString("bool"), 1, TypeEnum.Bool);
    private static final PrimitiveType String = new PrimitiveType(resourceBundle.getString("string"), 32, TypeEnum.string);
    private final String Name;
    private int Size;
    protected String toString;
    private final TypeEnum typeEnum;
    private LinkedList<FunctionSignature> functionSignatures = new LinkedList<>();

    Type(String name, int size, TypeEnum t)
    {
        Name = name;
        toString = "lulu." + name;
        Size = size;
        typeEnum = t;
    }

    public TypeEnum getTypeEnum()
    {
        return typeEnum;
    }

    public boolean isConvertable(Type t)
    {
        if (t == null)
        {
            return getTypeEnum() == TypeEnum.nullable;
        }
        if (getTypeEnum() == t.getTypeEnum())
        {
            return true;
        }
        switch (getTypeEnum())
        {
            case Int:
                switch (t.getTypeEnum())
                {
                    case Bool:
                        return true;
                    default:
                        return false;
                }
            case Float:
                switch (t.getTypeEnum())
                {
                    case Int:
                    case Bool:
                        return true;
                    default:
                        return false;
                }
            case Bool:
                if (t.getTypeEnum() == TypeEnum.Int)
                {
                    return true;
                }
                break;
            case string:
                switch (t.getTypeEnum())
                {
                    case Int:
                    case Bool:
                        return true;
                    default:
                        return false;
                }
        }
        return false;
    }

    public LinkedList<FunctionSignature> getFunctionSignatures()
    {
        return functionSignatures;
    }

    public void addFunctionSignature(FunctionSignature fS)
    {
        if (functionSignatures.contains(fS))
        {
            throw new CompileError("Function already defined in scope");
        }
        functionSignatures.add(fS);
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
        PrimitiveType(String name, int size, TypeEnum typeEnum)
        {
            super(name, size, typeEnum);
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
        super("Array<" + t.getName() + '>', length * t.getSize(), TypeEnum.Array);
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
        super(name, 0, TypeEnum.nullable);
    }

    @Override
    public String toString()
    {
        return "type " + getToString();
    }
}

class ArraySignature extends Array
{

    ArraySignature(Type t)
    {
        super(t, 0);
    }

    static ArraySignature generator(Type t, int dimension)
    {
        var temp = new ArraySignature(t);
        for (int i = 1; i < dimension; i++)
        {
            temp = new ArraySignature(temp);
        }
        return temp;
    }

    public String toString()
    {
        return "Abstract type " + getType().getToString();
    }
}
