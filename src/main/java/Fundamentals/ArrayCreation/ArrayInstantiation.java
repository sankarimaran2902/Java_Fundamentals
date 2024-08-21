package Fundamentals.ArrayCreation;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayInstantiation
{
    public static void main(String[] args) {
    char []initial=new char[5];
    initial[0]='S';
    initial[1]='V';
    initial[2]='R';                     //To access single character of a string
    initial[3]='T';
    initial[4]='O';
        System.out.println(Arrays.toString(initial));
        for(int i=0;i<initial.length;i++)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your name or other name:");
            char initial1=scan.next().charAt(5);//To access the  single character of a string or name in 1st index position.
            initial[i]=initial1;
        }
        System.out.println(Arrays.toString(initial));
    }
}
