package Fundamentals.Exception_Handling;

public class Throws_Keyword_Example
{
    public static void divide() throws ArithmeticException
    {
        System.out.println("Inside divide().");
        int result=500/0;
    }
    public static void checkNull() throws NullPointerException
    {
        System.out.println("Inside checkNull().");
        String str="null";
        System.out.println(str.length());
    }
    public static void execute() throws ArithmeticException,NullPointerException
    {
        divide();
        checkNull();
    }
    public static void main(String[] args)
    {
        try
        {
            execute();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception caught in main:"+ae.getMessage());
        }
        catch(NullPointerException ne)
        {
            System.out.println("NullPointer Exception caught in main:"+ne.getMessage());
        }
    }
}

