package Threads;
class B implements Runnable{ //Runnable Class-Start() method is not supported
    public void run()
    {
        System.out.println("Hey Hi...");
    }
}
public class Implements
{
    public static void main(String[] args)
    {
        Runnable obj=new B();
        Thread tt=new Thread(obj);//Thread Class Object Creation to Use start method
        tt.start();
    }
}
