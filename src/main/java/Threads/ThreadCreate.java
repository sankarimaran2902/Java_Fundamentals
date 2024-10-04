package Threads;
class Threadclass extends Thread{
    public void run()
    {
        System.out.println("Thread Created.....");
    }

}
public class ThreadCreate {
    public static void main(String[] args) {
        Threadclass tc=new Threadclass();
       // tc.run();-Default Method for Thread class
        tc.start();
    }
}
