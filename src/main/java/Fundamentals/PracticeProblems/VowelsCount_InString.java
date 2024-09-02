package Fundamentals.PracticeProblems;
import java.util.Scanner;
public class VowelsCount_InString
{
    public static int count_vowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Input a String:");
    String str=scan.nextLine();
    System.out.println("Number of Vowels in the string:"+count_vowels(str));
}
}
