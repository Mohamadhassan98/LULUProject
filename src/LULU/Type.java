package LULU;

import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.ResourceBundle;

abstract class Type
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private static final PrimitiveType Int = new PrimitiveType(resourceBundle.getString("int"), 32);
    private static final PrimitiveType Float = new PrimitiveType(resourceBundle.getString("float"), 64);
    private static final PrimitiveType Bool = new PrimitiveType(resourceBundle.getString("bool"), 1);
    private static final PrimitiveType string = new PrimitiveType(resourceBundle.getString("string"), 32);
    private final String Name;
    private int Size;

    Type(String name, int Size)
    {
        Name = name;
        this.Size = Size;
    }

    static PrimitiveType isPrimitive(ParseTree p)
    {
        switch (p.getText())
        {
            case "int":
                return Type.Int;
            case "float":
                return Type.Float;
            case "bool":
                return Type.Bool;
            case "string":
                return Type.string;
            default:
                return null;
        }
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

    private static class PrimitiveType extends Type
    {
        PrimitiveType(String name, int Size)
        {
            super(name, Size);
        }
    }
}

class Array
{
    private final Type type;
    private final int length;

    Array(@NotNull Type type, int length, int Size)
    {
        this.length = length;
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

class UserDefinedType extends Type
{
    UserDefinedType(String name)
    {
        super(name, 4);
    }
}
