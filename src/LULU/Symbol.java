package LULU;

import LULU.Type.PrimitiveType;

import java.util.LinkedList;
import java.util.List;

public abstract class Symbol
{
    private final String Name;
    private final int Size;
    private final Type type;
    private final boolean Const;
    private int Offset;

    Symbol(String name, int size, Type t, int offset, boolean isConst)
    {
        Name = name;
        Size = size;
        type = t;
        Offset = offset;
        Const = isConst;
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

    public static Symbol addNew(String name, Type t, int offset, boolean isConst)
    {
        return (t instanceof PrimitiveType) ? new PrimitiveSymbol(name, t, offset, isConst) : new UserDefinedSymbol(name, t, offset, isConst);
    }

    public int getOffset()
    {
        return Offset;
    }

    public void setOffset(int offset)
    {
        Offset = offset;
    }

    public boolean isConst()
    {
        return Const;
    }
}

class PrimitiveSymbol extends Symbol
{
    PrimitiveSymbol(String name, Type type, int offset, boolean isConst)
    {
        super(name, type.getSize(), type, offset, isConst);
    }
}

class UserDefinedSymbol extends Symbol
{
    UserDefinedSymbol(String name, Type type, int offset, boolean isConst)
    {
        super(name, 4, type, offset, isConst);
    }
}

class FunctionSignature
{
    private final List<Symbol> inputParameters = new LinkedList<>(), returnParameters = new LinkedList<>();

    private final String name;

    FunctionSignature(String name)
    {
        this.name = name;
    }

    public List<Symbol> getInputParameters()
    {
        return inputParameters;
    }

    public List<Symbol> getReturnParameters()
    {
        return returnParameters;
    }

    public void addInputParam(String name, Type type)
    {
//        if (type.isPrimitive())
//        {
//            inputParameters.add(new PrimitiveSymbol(name, type, 0, false));
//        }
//        else
//        {
//            inputParameters.add(new UserDefinedSymbol(name, type, 0, false));
//        }
        inputParameters.add(Symbol.addNew(name, type, 0, false));
    }

    public void addInputParam(int index, Type type)
    {
//        if (type.isPrimitive())
//        {
//            inputParameters.add(new PrimitiveSymbol("*" + index, type, 0, false));
//        }
//        else
//        {
//            inputParameters.add(new UserDefinedSymbol("*" + index, type, 0, false));
//        }
        inputParameters.add(Symbol.addNew("*" + index, type, 0, false));
    }

    public void addReturnParam(int index, Type type)
    {
//        if (type.isPrimitive())
//        {
//            returnParameters.add(new PrimitiveSymbol("*" + index, type, 0, false));
//        }
//        else
//        {
//            returnParameters.add(new UserDefinedSymbol("*" + index, type, 0, false));
//        }
        returnParameters.add(Symbol.addNew("*" + index, type, 0, false));
    }
}


