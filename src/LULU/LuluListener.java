package LULU;

import LULU.Lulu2Parser.FtDclContext;
import LULU.Lulu2Parser.VarDefContext;

public class LuluListener extends Lulu2BaseListener
{
    private final Tree tree = new Tree();

    @Override
    public void enterFtDcl(FtDclContext ctx)
    {

        for (int i = 2; i < (ctx.children.size() - 1); i++)
        {
            System.out.println(ctx.children.get(i).getChild(0).getText());
        }
    }

    @Override
    public void enterVarDef(VarDefContext ctx)
    {
        var first = ctx.children.get(0).getText();
        if (first.equals(ctx.CONST().getText()))
        {
            Type t = Type.isPrimitive(ctx.getChild(1));
            var counter = 2;
            if (t != null)
            {
                var child = ctx.getChild(counter).getText();
                while (!child.equals(ctx.SEMICOLON().getText()))
                {
//                    if(((DeclareScope)generalScope.innerNodes.getFirst()).innerNodes.)
                    counter++;
                }

            }
        }
    }
}
