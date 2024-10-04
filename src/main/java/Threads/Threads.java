package Threads;
class A extends Thread{
    public void run()
    {
        System.out.println("Saranya");
    }
}
public class Threads
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.start();
    }
}
