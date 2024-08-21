package Fundamentals.ArrayCreation;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInsert
{
    public static void main(String[] args)
    {
        int []arrayName=new int[7];
        arrayName[0]=10;
        arrayName[1]=20;
        arrayName[2]=30;
        arrayName[6]=70;
        System.out.println(Arrays.toString(arrayName));//it prints the array values
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<arrayName.length;i++)
        {
            System.out.println("Enter array values");//To insert the values from user not storing the value
            arrayName[i]=scan.nextInt();
        }
        for(int siva:arrayName)
        {
            System.out.println(siva);//stores the values which input from user
        }
    }
}
