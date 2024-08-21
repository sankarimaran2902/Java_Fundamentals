package Fundamentals.UserInput;
import java.util.Scanner;
public class DemoUserInput
{
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the Number 1");
//        int value1=scan.nextInt();
//        System.out.println("enter the Number 2");
//        int value2=scan.nextInt();
//        int output=value1+value2;
//        System.out.println("Output IS:"+output);
//        String place;
//        int age,pincode;
//        System.out.println("Tell us fav place ");
//        String favplace=scan.next();
//        System.out.println("Fav Place:"+favplace);
//        age=scan.nextInt();
//        System.out.println("Age is:"+age);
//        pincode=scan.nextInt();
//        System.out.println("Pincode :"+pincode);

            System.out.println("What your Name");
            String name=scan.next();
            System.out.println(" My Name is "+name);
            System.out.println("Re-Enter your name"); //To get Letter of the name using charAt()-returns the character at specified index
            char initial=scan.next().charAt(0);
            System.out.println("My inital:"+initial);


        }
}

