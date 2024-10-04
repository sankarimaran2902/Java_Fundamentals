package Threads;
class Main implements Runnable{
    public void run()
    {
        System.out.println("Runs by thread");
    }
}
public class ThreadImplements
{
    public static void main(String[] args) {
        Main mn=new Main();

        Thread tt=new Thread(mn);
        tt.start();
    }
}
