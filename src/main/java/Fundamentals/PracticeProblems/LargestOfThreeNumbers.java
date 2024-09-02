package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class LargestOfThreeNumbers
{
    public static double largest(double n1,double n2,double n3)        //Without return type with arguments
    {
        return Math.max(Math.max(n1,n2),Math.max(n2,n3));
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input first Number:");
        double n1=scan.nextDouble();
        System.out.println("Input second Number:");
        double n2=scan.nextDouble();
        System.out.println("Input third Number:");
        double n3=scan.nextDouble();
        System.out.println("The Largest of Three numbers:" +largest(n1,n2,n3));
    }
}
