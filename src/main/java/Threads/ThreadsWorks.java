package Threads;
class Siva extends Thread{
    void disp()
    {
            System.out.println("Sankari Good person");
    }
}
public class ThreadsWorks
{
    public static void main(String[] args)
    {
        Siva ss=new Siva();
        ss.disp();
    }
}
