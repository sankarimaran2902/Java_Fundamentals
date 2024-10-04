package Task;
import java.util.Scanner;
public class Flipkart
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Amount:");
        double amount=scan.nextDouble();
        if(amount>=50 && amount<=500)
        {
            System.out.println("Plastic Items are available at this price range");
        }
        else if(amount>500 && amount<=1000)
        {
            System.out.println("Clothes and Groceries Items are Available for this price Range");
        }
        else if(amount>1000 && amount<=50000){
            System.out.println("Furniture are Available at this price range");
        }
        else {
            System.out.println("Not Available");
        }
    }

}
