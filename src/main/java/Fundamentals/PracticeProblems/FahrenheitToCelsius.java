package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit:");
        double fahrenheit=scan.nextDouble();
        double celsius=((5*(fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+"in Celsius");
    }
}
//Note:Conversion of Degree from Fahrenheit to Celsius
//Formula:-
//       *C/5=(F-32/9)=>
//       *C=((5*(F-32.0))/9)