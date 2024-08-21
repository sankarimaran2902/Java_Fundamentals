package Fundamentals.ControlStatements;
import java.util.Scanner;
public class IfElseForVoting
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int votingEligibility=scan.nextInt();
        if(votingEligibility>=18)
        {
            System.out.println("Eligible for Voting");
        }
        else
        {
            System.out.println("Not Eligible for Voting");
        }


    }
}
