package Fundamentals.Fundamentals;
import java.util.Scanner;
public class Average {
    public static void main(String[] args)
    {
        Scanner gather = new Scanner(System.in);
        System.out.println("Enter Number1:");
       int num1 = gather.nextInt();
        System.out.println("Enter Number2:");
        int num2 = gather.nextInt();
        System.out.println("Enter Number3:");
        int num3 = gather.nextInt();
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers:" + average);

    }
}
