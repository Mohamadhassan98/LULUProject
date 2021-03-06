package LULU;

import org.antlr.v4.runtime.tree.TerminalNode;

class CompileError extends RuntimeException
{
    private static final long serialVersionUID = -1166148932026956741L;

    CompileError(String message)
    {
        super(message);
    }

    CompileError(String message, TerminalNode node)
    {
        super(message + " at line #" + node.getSymbol().getLine());
    }

    CompileError(String message, Throwable cause)
    {
        super(message, cause);
    }

    CompileError(Throwable cause)
    {
        super(cause);
    }
}

class RuntimeException extends java.lang.RuntimeException
{
    private static final long serialVersionUID = -9215487551940053678L;

    RuntimeException(String message)
    {
        super(message);
    }

    RuntimeException(String message, Throwable cause)
    {
        super(message, cause);
    }

    RuntimeException(Throwable cause)
    {
        super(cause);
    }
}

class DuplicateIdException extends RuntimeException
{
    private static final long serialVersionUID = 1607396543826474367L;

    DuplicateIdException(String message)
    {
        super(message);
    }

    DuplicateIdException(String message, Throwable cause)
    {
        super(message, cause);
    }

    DuplicateIdException(Throwable cause)
    {
        super(cause);
    }
}
