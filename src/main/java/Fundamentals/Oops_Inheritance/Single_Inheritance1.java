package Fundamentals.Oops_Inheritance;

public class Single_Inheritance1 extends Single_Inheritance //Child class joins the parent class by using extends
{
    public void Sub()
    {
        int a=200;
        int b=15;
        int c=a-b;
        System.out.println("The Subtraction of a-b is:"+c);
    }
    public static void main(String[] arguments)
    {
        Single_Inheritance1 si=new Single_Inheritance1(); //Object creation for child class only becoz they have joined already
        si.Add();
        si.Sub();
    }
}
