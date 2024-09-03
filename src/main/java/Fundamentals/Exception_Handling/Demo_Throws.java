package Fundamentals.Exception_Handling;

public class Demo_Throws
{
    public static void ageValidate(int age) throws IllegalArgumentException
    {
        if(age<0 || age>120)
        {
            throw new IllegalArgumentException("Invalid Age:"+age);
        }
        else{
            System.out.println("Valid age:"+age);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            ageValidate(-5);
        }catch(IllegalArgumentException ie)
        {
            System.out.println(ie);
            System.out.println("Exception Caught:"+ie.getMessage());
        }
    }
}
