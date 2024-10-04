package Threads;
import java.util.Arrays;
public class PerfomThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable Execution=new SortingExecution();
        Thread th1=new Thread(Execution,"Annamalai");
        Thread th2=new Thread(Execution,"Sathish");
        Thread th3=new Thread(Execution,"Manoj");
        Thread th4=new Thread(Execution,"Rajesh");
        th2.setPriority(10);//max priority =10,min =1,default=5

        th1.start();
        th1.join();
        th2.start();
        th2.join();
        th3.start();
        th3.join();
        th4.start();
        th4.join();
    }
}

class SortingExecution implements Runnable
{
    public void run()
    {
        System.out.println("My Thread Name is :"+Thread.currentThread().getName());
        System.out.println("My Thread Priority no :"+Thread.currentThread().getPriority());
        System.out.println("My Thread Id Number :"+Thread.currentThread().getId());
        BubbleSort();
    }
    public void BubbleSort()
    {
        double[] pointers={45.3,45.5,56.5,98.9,89.9,65.7,69.1,11.2,32.1,1.1,66.6};
        System.out.println("Before Sorting a array values "+ Arrays.toString(pointers));

        for(int i=0;i<pointers.length;i++)
        {
            for(int j=0;j< pointers.length-i-1;j++)
            {
                if(pointers[j]<pointers[j+1])//45.3<45.5
                {
                    double swaping=pointers[j]; //swapping=45.3
                    pointers[j]=pointers[j+1]; //j=45.5
                    pointers[j+1]=swaping;// j+1= 45.3
                }
            }
        }

        System.out.println("After sorting a Array values"+Arrays.toString(pointers));
    }
}