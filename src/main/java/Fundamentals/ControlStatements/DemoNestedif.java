package Fundamentals.ControlStatements;
import java.util.Scanner;
public class DemoNestedif{
    static void Nestedif(int cibilScore,double salary)
    {
        if(cibilScore>=750)
        {
            System.out.println("Your card Approved");
            if((salary>=2.2) && (salary<=3.2)) {
                System.out.println("Your card limit 50k Approved");
            }
                else if((salary>=3.3) && (salary<=5.5))
                {
                System.out.println("Your card limit 1Lakh Approved");
                Scanner gather=new Scanner(System.in);
                System.out.println("Enter your Aadhar Number");
                long aadharNumber=gather.nextLong();
                        if(aadharNumber==123456789)
                        {
                            System.out.println("Welcome to Credit card service");
                        }
                        else
                        {
                            System.out.println("Not valid");
                        }
                }
                else if(salary>5)
                {
                System.out.println("Your card limit Two Lakhs Only ");
                }
            else
            {
                System.out.println("Salary Low");
            }
            }
            else
            {
                System.out.println("Not Approved card");
            }
        }
        public static void main(String[] args)
        {
            Scanner gather=new Scanner(System.in);
            System.out.println("HDFC Credit Card");
            System.out.println("Enter Your Cibilscore");
            int cibilScore=gather.nextInt();
            System.out.println("Enter your Salary");
            double salary=gather.nextDouble();
            DemoNestedif.Nestedif(cibilScore,salary);
        }
    }
