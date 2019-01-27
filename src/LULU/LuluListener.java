package LULU;

import LULU.Lulu2Parser.*;
import LULU.Tree.DeclareScope;
import LULU.Tree.GlobalScope;
import LULU.Tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class LuluListener extends Lulu2BaseListener
{
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("LULUStrings");
    private static final Tree tree = new Tree();
    static Node currentNode = tree.getRoot();
    private static DeclareScope declareScope;

    /**
     * This method does something.
     *
     * @param id
     * @return
     */
    private static boolean declareHasType(String id)
    {
        DeclareScope declare = null;
        if (tree.getRoot().getChild(0).getScope().getScopeType() == ScopeType.DeclareScope)
        {
            declare = declareScope;
        }
        if (declare != null)
        {
            return declare.getTypes().stream().anyMatch(type -> type.getName().equals(id));
        }
        return false;
    }

    private static boolean globalHasType(String id)
    {
        var global = tree.getGlobalScope();
        return global.getTypes().stream().anyMatch(type -> type.getName().equals(id));
    }

    public static boolean hasType(String id)
    {
        return declareHasType(id) || globalHasType(id);
    }

    public static boolean nodeHasId(Node node, String id)
    {
        return node.getScope().getSymbols().stream().anyMatch(symbol -> symbol.getName().equals(id));
    }

    private static Type getTypeFromDeclare(String id)
    {
        DeclareScope declare = null;
        if (tree.getRoot().getChild(0).getScope().getScopeType() == ScopeType.DeclareScope)
        {
            declare = declareScope;
        }
        if (declare != null)
        {
            return declare.getTypes().stream().filter(type -> type.getName().equals(id)).findFirst().orElse(null);
        }
        return null;
    }

    private static Type getTypeFromGeneral(String id)
    {
        GlobalScope global = tree.getGlobalScope();
        return global.getTypes().stream().filter(type -> type.getName().equals(id)).findFirst().orElse(null);
    }

    static Type getType(String id)
    {
        Type typeFromDeclare = getTypeFromDeclare(id);
        if (typeFromDeclare != null)
        {
            return typeFromDeclare;
        }
        return getTypeFromGeneral(id);
    }

    @Override
    public void enterFtDcl(FtDclContext ctx)
    {
        tree.addChild(currentNode, ScopeType.DeclareScope, resourceBundle.getString("declare"));
        declareScope = (DeclareScope) tree.getRoot().getChild(0).getScope();
        currentNode = currentNode.getChild(0);
    }

    @Override
    public void enterFuncDcl(FuncDclContext ctx)
    {
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
                var ide = ctx.args(0).typeBrace(i).type().getText();
                if (child.isEmpty())
                {//Have no dimension
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();

                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .args(0)
                                .typeBrace(i)
                                .type()
                                .ID()));
                        return;
                    }
                    functionSignature.addReturnParam(i, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();
                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .args(0)
                                .typeBrace(i)
                                .type()
                                .ID()));
                        return;
                    }
                    functionSignature.addReturnParam(i, ArraySignature.generator(typee.get(), child.size()));
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
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();
                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .args(ctx.args().size() - 1)
                                .typeBrace(index)
                                .type()
                                .ID()));
                        return;
                    }
                    functionSignature.addInputParam(i, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();
                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .args(ctx.args().size() - 1)
                                .typeBrace(index)
                                .type()
                                .ID()));
                        return;
                    }
                    functionSignature.addInputParam(i, ArraySignature.generator(typee.get(), child.size()));
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
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();
                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .argsVar()
                                .typeBrace(index)
                                .type()
                                .ID()));
                        return;
                    }
                    var id = ctx.argsVar().ID(i).getText();
                    if (ids.contains(id))
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .argsVar()
                                .typeBrace(index)
                                .type()
                                .ID()));
                        return;
                    }
                    ids.add(id);
                    functionSignature.addInputParam(id, typee.get());
                }
                //At least have one dimension
                else
                {
                    var typee = declareScope.getTypes().stream().filter(type -> type.getName().equals(ide)).findFirst();
                    if (typee.isEmpty())
                    {
                        currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " '" + ide + "'", ctx
                                .argsVar()
                                .typeBrace(index)
                                .type()
                                .ID()));
                        return;
                    }
                    var id = ctx.argsVar().ID(i).getText();
                    if (ids.contains(id))
                    {
                        currentNode.throwError(new CompileError("variable already defined", ctx.argsVar()
                                                                                               .typeBrace(index)
                                                                                               .type()
                                                                                               .ID()));
                        return;
                    }
                    ids.add(id);
                    functionSignature.addInputParam(id, ArraySignature.generator(typee.get(), child.size()));
                }
            }
        }
        declareScope.addFunctionSignature(functionSignature);
    }

    @Override
    public void exitFtDcl(FtDclContext ctx)
    {
        declareScope.getFunctionSignatures().forEach(functionSignature ->
        {
            System.out.println(functionSignature.getName());
            functionSignature.getReturnParameters()
                             .forEach(symbol -> System.out.println(symbol.getName() + "##" + symbol.getType()
                                                                                                   .getName() + "##" + symbol
                                     .getSize()));
            functionSignature.getInputParameters()
                             .forEach(symbol -> System.out.println(symbol.getName() + "##" + symbol.getType()
                                                                                                   .getName() + "##" + symbol
                                     .getSize()));
        });
    }

    private Type getRefType(Type t, List<ExprContext> exprs)
    {
        if (exprs.isEmpty())
        {
            return t;
        }
        var first = exprs.remove(0);
        if ((first.t != Type.Int()) && (first.t != Type.Bool()))
        {
            currentNode.throwError(new CompileError("incompatible types"));
            return null;
        }
        Array arraySignature;
        if (first.constVal == null)
        {
            arraySignature = new ArraySignature(getRefType(t, exprs));
        }
        else
        {
            var size = 0;
            if (first.t == Type.Bool())
            {
                size = Boolean.parseBoolean(first.constVal().BoolLiteral().getText()) ? 1 : 0;
            }
            else
            {
                size = Integer.parseInt(first.constVal().IntLiteral().getText());
            }
            arraySignature = new Array(getRefType(t, exprs), size);
        }
        return arraySignature;
    }

    @Override
    public void enterVarDef(VarDefContext ctx)
    {
        var typesh = getType(ctx.type().getText());
        if (typesh == null)
        {
            currentNode.throwError(new CompileError(resourceBundle.getString("typenotdefined") + " " + ctx.type()
                                                                                                          .getText()));
            return;
        }
        if (ctx.CONST() != null)
        {
            ctx.varVal().forEach(varValContext ->
            {
                if (currentNode.getScope()
                               .getSymbols()
                               .stream()
                               .anyMatch(symbol -> symbol.getName().equals(varValContext.ref().ID().getText())))
                {
                    currentNode.throwError(new CompileError("variable '" + varValContext.ref()
                                                                                        .ID()
                                                                                        .getText() + "' already defined"));
                    return;
                }
                var ref = varValContext.ref();
                var type = getRefType(typesh, ref.expr());
                if (type == null)
                {
                    return;
                }
                if (varValContext.ASSIGN() == null)
                {
                    currentNode.throwError(new CompileError("variable might not have been initialized"));
                    return;
                }
                if (type.isConvertable(varValContext.expr().t))
                {
                    currentNode.getScope().addSymbol(Symbol.addNew(varValContext.ref().ID().getText(), type, 0, true));
                }
                else
                {
                    currentNode.throwError(new CompileError("incompatible types"));
                }
            });
        }
        else
        {
            ctx.varVal().forEach(varValContext ->
            {
                if (currentNode.getScope()
                               .getSymbols()
                               .stream()
                               .anyMatch(symbol -> symbol.getName().equals(varValContext.ref().ID().getText())))
                {
                    currentNode.throwError(new CompileError("variable '" + varValContext.ref()
                                                                                        .ID()
                                                                                        .getText() + "' already defined"));
                    return;
                }
                var ref = varValContext.ref();
                var type = getRefType(typesh, ref.expr());
                if (type == null)
                {
                    return;
                }
                if (varValContext.ASSIGN() == null)
                {
                    currentNode.getScope().addSymbol(Symbol.addNew(varValContext.ref().ID().getText(), type, 0, false));
                    return;
                }
                if (type.isConvertable(varValContext.expr().t))
                {
                    currentNode.getScope().addSymbol(Symbol.addNew(varValContext.ref().ID().getText(), type, 0, false));
                }
                else
                {
                    currentNode.throwError(new CompileError("incompatible types"));
                }
            });
        }
    }

    @Override
    public void enterTypeDcl(TypeDclContext ctx)
    {
        var types = ((DeclareScope) currentNode.getScope()).getTypes();
        boolean duplicate = false;
        for (var type : types)
        {
            if ((ctx.ID().getText().equals(type.getName())))
            {
                duplicate = true;
                break;
            }
        }
        if (duplicate)
        //the ID has already been added to the list
        {
            currentNode.throwError(new CompileError("Type " + ctx.ID()
                                                                 .getText() + " has already been defined in declare scope", ctx
                    .ID()));
            return;
        }
        //else
        declareScope.addType(new UserDefinedType(ctx.ID().getText()));
    }
}
