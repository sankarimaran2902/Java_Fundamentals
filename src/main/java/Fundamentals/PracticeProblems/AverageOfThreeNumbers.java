package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class AverageOfThreeNumbers
{
    public static double middle(double n1,double n2,double n3)
    {
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input First Number:");
        double n1=scan.nextDouble();
        System.out.println("Input Second Number:");
        double n2=scan.nextDouble();
        System.out.println("Input Third Number:");
        double n3=scan.nextDouble();
        System.out.println("Middle of Three numbers:"+middle(n1,n2,n3));
    }
}
