package Fundamentals.ControlStatements;
import java.util.Scanner;
public class DemoStatements
{
    public static void main(String[] args)
    {
        Scanner gather = new Scanner(System.in);
        System.out.println("Kindly give your company details");
        String employeeCompanyDetails = gather.nextLine();
        if (employeeCompanyDetails.equalsIgnoreCase("Zealous"))
        {
            System.out.println("You are Working in IT Field");
        } else if (employeeCompanyDetails.equalsIgnoreCase("Cts"))
        {
            System.out.println("You are working in BPO process");
        } else
        {
            System.out.println("You are not working in both Category");
        }
    }
}