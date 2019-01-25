package LULU;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        var input = new ANTLRInputStream(System.in);
        var lexer = new Lulu2Lexer(input);
        var tokens = new CommonTokenStream(lexer);
        var parser = new Lulu2Parser(tokens);
        var tree = parser.main();
        var walker = new ParseTreeWalker();
        var listener = new LuluListener();
        walker.walk(listener, tree);
    }
}