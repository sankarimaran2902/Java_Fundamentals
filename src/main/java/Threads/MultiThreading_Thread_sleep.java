package Threads;
class Department
{
    void details() throws InterruptedException {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Preethi and Sankari");
            Thread.sleep(10000);
        }
    }
}
class College
{
    void collegename() throws InterruptedException {
        System.out.println("Saran College");
        Thread.sleep(10000);
    }
}
public class MultiThreading_Thread_sleep
{
    public static void main(String[] args) throws InterruptedException {
        Department dd=new Department();
        dd.details();
        College cc=new College();
        cc.collegename();
    }
}
