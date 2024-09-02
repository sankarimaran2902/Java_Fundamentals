package Fundamentals.Exception_Handling;
import java.util.Scanner;
public class Demo_Chance
{
   static Scanner scan =new Scanner(System.in);
    public static void unlimit(String content)
    {
        try
        {
            System.out.println("Enter the Starting value");
            int start=scan.nextInt();
            System.out.println("Enter the Ending Value");
            int end=scan.nextInt();
            System.out.println("My values:"+content.substring(start,end));
        }catch(StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting value is 0 ending value"+content.length() +"\n Please enter the value only between these numbers");
            unlimit(content);
        }
    }
    public static void limit(String content,int chance)
    {
        try
        {
            System.out.println("Enter the Starting value");
            int start=scan.nextInt();
            System.out.println("Enter the Ending Value");
            int end=scan.nextInt();
            System.out.println("My values:"+content.substring(start,end));
        }catch(StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting value is 0 ending value"+content.length() +"\n Please enter the value only between these numbers");
            if(chance<3)
            {
                chance++;
                limit(content,chance);
            }
            else {
                System.out.println("Chance is over");
            }
        }
    }
    public static void main(String[] args)
    {
        String content="Don't judge a book by its cover,Makes smile in everyone face";
        //unlimit(content);
        limit(content,2);
    }
}
