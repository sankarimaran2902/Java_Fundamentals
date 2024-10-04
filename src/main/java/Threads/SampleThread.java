package Threads;
public class SampleThread
{
    public static void main(String[] args) throws InterruptedException //Main Method-Thread
     {
            Laptop lap=new Laptop();//Thread Class
            lap.start();
            while(lap.isAlive())
            {
                System.out.println("my laptop class Thread is working");
                break;
            }
            lap.join();

            Computer com=new Computer();
            Thread th=new Thread(com);
            th.start();


            th.join();

            System.out.println("Welcome to Thread...!");
        }
    }


    class Laptop extends Thread
    {
        public void run()
        {
            for(int index=0;index<=5;index++)
            {
                System.out.println("Welcome to New thread ...!"+index);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    class Computer implements Runnable
    {
        public void run()
        {
            for(int pos=0;pos<=5;pos++)
            {
                System.out.println(pos);
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {

                }
            }
        }
    }

