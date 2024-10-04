package Threads;
class bird implements Runnable{
    @Override
    public void run() {
        System.out.println("Sankari and Preethi are Best Friends");
    }
}
class Animal extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MultiThreadingImplements
{
    public static void main(String[] args) {
        Runnable rc = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Saran");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };
        Animal aa = new Animal();
        Thread tt = new Thread(rc);
        tt.setName("Kumar");
        System.out.println(tt.getName());
        tt.setPriority(1);
        tt.setPriority(tt.getPriority());
        tt.setPriority(Thread.MAX_PRIORITY);
        System.out.println(tt.getPriority());
        tt.start();
        aa.start();
    }
}








