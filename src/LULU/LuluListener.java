package LULU;

import LULU.Lulu2Parser.FtDclContext;
import LULU.Lulu2Parser.FuncDclContext;
import LULU.Lulu2Parser.TypeDclContext;
import LULU.Lulu2Parser.VarDefContext;
import LULU.Tree.DeclareScope;
import LULU.Tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

@SuppressWarnings("ALL")
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
        var argsSize = ctx.args().size();
        //region Description
        if (ctx.OpenPar().size() != 1)
        {
            //Have return type
            argsSize--;
            for (var i = 0; i < ctx.args(0).typeBrace().size(); i++)
            {
                var child = ctx.args(0).typeBrace(i).OpenBrace();
                int index = i;
                var ide = ctx.args(0).typeBrace(index).type().getText();
                if (child.isEmpty())
                {//Have no dimension
//                    System.out.println(currentNode);
//                    System.out.println(((DeclareScope) currentNode.getScope()));
//                    System.out.println(((DeclareScope) currentNode.getScope()).getTypes());
//                    System.out.println(ctx);
//                    System.out.println(ctx.args());
//                    System.out.println(ctx.args(0).typeBrace());
//                    System.out.println(ctx.args(0).typeBrace(index).type());
//                    System.out.println(ctx.args(0).typeBrace(index).type().ID());
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();

                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    functionSignature.addReturnParam(i, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();
                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    functionSignature.addReturnParam(i, new ArraySignature(typee.get(), child.size()));
                }
            }
        }
        //endregion
        if (argsSize == 1)
        {
            //args, no argsVar
            for (var i = 0; i < ctx.args(ctx.args().size() - 1).typeBrace().size(); i++)
            {
                var child = ctx.args(ctx.args().size() - 1).typeBrace(i).OpenBrace();
                int index = i;
                var ide = ctx.args(ctx.args().size() - 1).typeBrace(index).type().getText();
                if (child.isEmpty())
                {//Have no dimension
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();
                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    functionSignature.addInputParam(i, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();
                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    functionSignature.addInputParam(i, new ArraySignature(typee.get(), child.size()));
                }
            }
        }
        else if (ctx.argsVar() != null)
        {
            List<String> ids = new LinkedList<>();
            //argsVar, no args
            for (var i = 0; i < ctx.argsVar().typeBrace().size(); i++)
            {
                var child = ctx.argsVar().typeBrace(i).OpenBrace();
                int index = i;
                var ide = ctx.argsVar().typeBrace(index).type().getText();
                if (child.isEmpty())
                {//Have no dimension
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();
                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    var id = ctx.argsVar().ID(i).getText();
                    if (ids.contains(id))
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    ids.add(id);
                    functionSignature.addInputParam(id, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = ((DeclareScope) currentNode.getScope()).getTypes()
                                                                       .stream()
                                                                       .filter(type -> type.getName().equals(ide))
                                                                       .findFirst();
                    if (typee.isEmpty())
                    {
                        throw new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'");
                    }
                    var id = ctx.argsVar().ID(i).getText();
                    if (ids.contains(id))
                    {
                        throw new CompileError("variable already defined");
                    }
                    ids.add(id);
                    functionSignature.addInputParam(id, new ArraySignature(typee.get(), child.size()));
                }
            }
        }
        ((DeclareScope) currentNode.getScope()).addFunctionSignature(functionSignature);
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
    public void exitFtDcl(FtDclContext ctx)
    {
        ((DeclareScope) currentNode.getScope()).getFunctionSignatures().forEach(functionSignature ->
        {
            System.out.println(functionSignature.getName());
            functionSignature.getReturnParameters().forEach(symbol ->
            {
                System.out.println(symbol.getName() + "##" + symbol.getType().getName() + "##" + symbol.getSize());
            });
            functionSignature.getInputParameters().forEach(symbol ->
            {
                System.out.println(symbol.getName() + "##" + symbol.getType().getName() + "##" + symbol.getSize());
            });
        });
    }

    @Override
    public void enterVarDef(VarDefContext ctx)
    {
        System.out.println(ctx.varVal().size());
    }

    @Override
    public void enterTypeDcl(TypeDclContext ctx)
    {
        var types = ((DeclareScope) currentNode.getScope()).getTypes();
        boolean duplicate = false;
        for (var type : types)
        {
            System.out.println(ctx.ID().getText());
            if ((ctx.ID().getText().equals(type.getName())))
            {
                duplicate = true;
                break;
            }
        }
        if (duplicate)
        //the ID has already been added to the list
        {
            throw new CompileError("Type" + ctx.ID().getText() + " has already been defined in declare scope");
        }
        //else
        ((DeclareScope) currentNode.getScope()).addType(new UserDefinedType(ctx.ID().getText()));
    }


}
