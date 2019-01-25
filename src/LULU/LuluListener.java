package LULU;

import LULU.Lulu2Parser.FtDclContext;
import LULU.Lulu2Parser.FuncDclContext;
import LULU.Lulu2Parser.TypeDclContext;
import LULU.Lulu2Parser.VarDefContext;
import LULU.Tree.DeclareScope;
import LULU.Tree.Node;

import java.util.ResourceBundle;

public class LuluListener extends Lulu2BaseListener
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private final Tree tree = new Tree();
    private Node currentNode = tree.getRoot();

    @Override
    public void enterFtDcl(FtDclContext ctx)
    {
        tree.addChild(currentNode, ScopeType.DeclareScope, resourceBundle.getString("declare"));
        currentNode = currentNode.getChild(0);
    }

    @Override
    public void enterFuncDcl(FuncDclContext ctx)
    {
        var children = ctx.children;
        FunctionSignature functionSignature = new FunctionSignature(ctx.ID().getText());
        if (ctx.OpenPar().size() != 1)
        {
            //Have return type
            for (var i = 0; i < ctx.args(0).typeBrace().size(); i++)
            {
                var child = ctx.args(0).typeBrace(i).OpenBrace();
                int index = i;
                if (child.isEmpty())
                {//Have no dimension
//                    Type typee = ctx.args(0).typeBrace(i).type().t;
//                    if (typee == null)
//                    {
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                            .stream()
                            .filter(type -> type.getName()
                                    .equals(ctx.args(0)
                                            .typeBrace(index).type
                                            .ID()
                                            .getText()))
                            .findFirst();
//                    }
                    if (typee.isEmpty())
                    {
                        throw new CompileError("Type is not defined");
                    }
                    functionSignature.addReturnParam(i, typee.get());
                }
                //At least have one dimension
                else
                {
                    //                            new ArraySignature(ctx.args(0).typeBrace(i).type.ID().getText(), child.size());
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                            .stream()
                            .filter(type -> type.getName()
                                    .equals(ctx.args(0)
                                            .typeBrace(index).type
                                            .ID()
                                            .getText()))
                            .findFirst();

                }
            }
        }

//        System.out.println("*******");
//        System.out.println(ctx.OpenPar());
//        System.out.println("*******");
//        System.out.println(ctx.OpenPar(0));
//        System.out.println("*******");
//        System.out.println(ctx.OpenPar(0).getSymbol());
//        System.out.println("*******");
//        System.out.println(ctx.OpenPar(0).getSymbol().getText());
//        System.out.println("*******");
//        if(children.get(0).equals(ctx.OpenPar(0)))
    }

    @Override
    public void enterVarDef(VarDefContext ctx)
    {

        if (ctx.children.get(0).getText().equals(ctx.CONST().getText()))
        {
            //TODO :)
        }

    }

    @Override
    public void enterTypeDcl(TypeDclContext ctx)
    {
        var types = ((DeclareScope)currentNode.getScope()).getTypes();
        boolean duplicate = false;
        for (var type:types)
            if((ctx.ID().getText().equals(type.getName())))
            {
                duplicate = true;
                break;
            }
        if (duplicate)
            //the ID has already been added to the list
            throw new CompileError("Type" + ctx.ID().getText() +" has already been defined in declare scope");
        //else
        ((DeclareScope)currentNode.getScope()).addType(new UserDefinedType(ctx.ID().getText()));
    }


}
