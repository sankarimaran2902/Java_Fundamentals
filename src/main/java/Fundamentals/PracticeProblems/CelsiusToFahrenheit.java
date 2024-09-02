package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Degree in Celsius:");
        double celsius=scan.nextDouble();
        double Fahrenheit=(9*celsius+(32*5))/5;
        System.out.println(celsius+"degree Celsius is equal to "+Fahrenheit+"in fahrenheit");
    }
}
//Note:Formula of degree from Celsius to Fahrenheit
//F=(9*Celsius+(32*5))/5
//F=(9C+(32*5))/5