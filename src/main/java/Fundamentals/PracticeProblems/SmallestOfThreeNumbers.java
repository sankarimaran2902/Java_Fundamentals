package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class SmallestOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input First Number:");
        int num1=scan.nextInt();
        System.out.println("Input Second Number:");
        int num2=scan.nextInt();
        System.out.println("Input Third Number:");
        int num3=scan.nextInt();
        System.out.println("The smallest number is:"+ smallest(num1,num2,num3) );
    }

    private static int smallest(int num1, int num2, int num3)
    {
        return Math.min(Math.min(num1,num2),Math.min(num2,num3));            //Math.min(x,y)
    }
}
