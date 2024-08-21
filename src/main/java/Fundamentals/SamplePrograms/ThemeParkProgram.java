package Fundamentals.SamplePrograms;
import java.util.Scanner;
public class ThemeParkProgram
{
    static void NestedIf(int age,float weight) {
        if (age >= 18)
        {
            System.out.println("Allowed for Water games and Dry games");
            if ((weight >= 80) && (weight <= 100))
            {
                System.out.println("Allowed for RollerCoaster");
            }
            else if ((weight >= 50) && (weight <= 70))
            {
                System.out.println("Allowed for Sliding");
            }
            else
            {
                System.out.println("Allowed for Water area");
            }

        }
        else
        {
            System.out.println("Allowed only for Dry games");
        }
    }
        public static void main(String[] args)
        {
            Scanner gather = new Scanner(System.in);
            System.out.println("Welcome to Theme Park!!!");
            System.out.println("Kindly Enter your age");
            int age = gather.nextInt();
            System.out.println("Enter Your Weight");
            float weight=gather.nextFloat();
            ThemeParkProgram.NestedIf(age,weight);

        }
}