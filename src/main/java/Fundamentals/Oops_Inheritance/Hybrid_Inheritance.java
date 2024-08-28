package Fundamentals.Oops_Inheritance;
class Grandpa
{
    public void senior()
    {
        System.out.println("He is Head of the Family");
    }
}
class Father extends Grandpa{
    public void smallSenior()
    {
        System.out.println("He is Small Head of the Family");
    }
}
class Son extends Grandpa
{
    public void children()
    {
        System.out.println("He is Small boy in the Family");
    }
}
class Daughter extends Father{
    public void child()
    {
        System.out.println("She is very Clever girl in the Family");
    }
}
public class Hybrid_Inheritance
{
    public static void main(String[] args)
    {
        Daughter dc=new Daughter();
        dc.senior();
        dc.smallSenior();
        dc.child();
        Son sc=new Son();
        sc.children();

    }
}
