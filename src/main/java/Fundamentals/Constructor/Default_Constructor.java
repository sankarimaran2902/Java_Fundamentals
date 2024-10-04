package Fundamentals.Constructor;

public class Default_Constructor
{
    public void hello()
    {
        System.out.println("Hello There....");
    }
    public Default_Constructor()                       //Constructor Declared
    {
        System.out.println("This is Default Constructor");
    }
    public static void main(String[] args)
    {
        //classname objectname= new constructorname();
        Default_Constructor dc=new Default_Constructor();
        dc.hello();
    }
}


