package Fundamentals.ArrayCreation;
import java.util.Scanner;
public class ArrayRead
{
    public static void main(String[] args)
    {
        String []IT_Company={"CTS","TCS","IBM","Zoho","Infosys","TechMahindra","Wipro"};
        Scanner scan = new Scanner(System.in);
        System.out.println(IT_Company.length);
        System.out.println("Tell us CompanyName:");
        String company=scan.next();

        for(int index=0;index<=IT_Company.length;index++)
        {
            if(company.equalsIgnoreCase(IT_Company[index]))
            {
                System.out.println(index);
                System.out.println("IT COMPANY NAME AVAILABLE "+company);
                return;
            }


        }
        System.out.println("Not founded");
    }
}

