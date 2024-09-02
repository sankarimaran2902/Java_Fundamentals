package Fundamentals.Exception_Handling;

public class Demo_ArithmeticException
{
    public static void main(String[] args)
    {
        try             //It executes the logic by handle the error
        {
            int data=500;
            int value=0;
            int res=data/value;
            System.out.println(res);
        }
        catch(ArithmeticException e)//It executes and print the code block(error prints)
        {
            System.out.println(e);
        }
        System.out.println("Hello world");//Try and catch-gives one chance to execute this block also
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
}
