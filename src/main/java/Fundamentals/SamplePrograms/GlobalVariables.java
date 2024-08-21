package Fundamentals.SamplePrograms;

public class GlobalVariables
{
    String name="Siva";            //global variable
    public void gather()
    {
        String name1="Preethi";  //local variable
        System.out.println("My name is "+name);
        System.out.println("Name 1:"+name1);
    }
    public static void main(String[] args)
    {
       GlobalVariables scan=new GlobalVariables();
       scan.gather();
    }
}