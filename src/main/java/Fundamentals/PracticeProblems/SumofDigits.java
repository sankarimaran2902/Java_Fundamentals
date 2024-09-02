package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class SumofDigits
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int sum=0;
        for(int i=0;i<num;i++)
        {
            int digit=num%10;      //Get last digit
            sum=sum+digit;       //Add the digit to the sum
            num=num/10;        //Remove the Last Digit
        }
        System.out.println("Sum of Digits is:"+sum);
    }
}
