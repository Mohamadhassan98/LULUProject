package LULU;

public class Exception extends java.lang.Exception
{
    public Exception(String message)
    {
        super(message);
    }

    public Exception(String message, Throwable cause)
    {
        super(message, cause);
    }

    public Exception(Throwable cause)
    {
        super(cause);
    }
}

class RuntimeException extends Exception
{
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

class DuplicateIdException extends java.lang.RuntimeException
{
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
