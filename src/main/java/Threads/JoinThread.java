package Threads;
class C extends Thread
{
    int j=0;
    public void run()
    {
      for(int i=0;i<10;i++)
      {
          j=i;
      }
    }
}
public class JoinThread
{
    public static void main(String[] args)
    {
        C obj=new C();
        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(obj.j);

    }
}
