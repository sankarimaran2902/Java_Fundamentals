package Fundamentals.Fundamentals;
import java.util.Scanner;
public class TablesUpTo10
{
    public static void main(String[] args){
        Scanner gather=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num1=gather.nextInt();
        for(int i=0;i<10;i++)
        {
            System.out.println(num1+ "x" +(i+1)+ "="+(num1*(i+1)));
        }

    }
}
