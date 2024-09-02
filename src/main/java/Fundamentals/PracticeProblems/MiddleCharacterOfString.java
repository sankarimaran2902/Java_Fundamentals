package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class MiddleCharacterOfString
{
    public static String middle(String str)
    {
        int position;
        int length;
        if(str.length()%2==0)      //for even string length
        {
            position=str.length()/2 -1;
            length=2;
        }
        else                        //for odd string length
        {
            position=str.length()/2;
            length=1;
        }
        return str.substring(position,position+length);//To print middle character using substring()
    }
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Input a String:");
       String str=scan.nextLine();
       System.out.println("The Middle Character of String:"+middle(str));
    }
}
