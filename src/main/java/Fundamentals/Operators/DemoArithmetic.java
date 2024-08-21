package Fundamentals.Operators;

public class DemoArithmetic
{
    public void Sum()
    {
        int pizza=350;
        int burger=250;
        int kfc;
        //Arithmetic operators
        //+,-,/,*,%
        kfc=pizza+burger;
        System.out.println("Addition Operators:"+kfc);
        kfc=pizza-burger;
        System.out.println("Subtraction Operators:"+kfc);
        kfc=pizza/burger;
        System.out.println("Division operators:"+kfc);
        kfc=pizza*burger;
        System.out.println("Multiplication Operators:"+kfc);
        kfc=pizza%burger;
        System.out.println("Modulus operators:"+kfc);
    }
    public static void main(String[] args)
    {
        DemoArithmetic scan=new DemoArithmetic();
        scan.Sum();
    }
}
