package Fundamentals.ArrayCreation;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysUpdate
{
    public static void main(String[] args)
    {
        String Details[]={"Preethi","Annan","Saranya","Priya","Siva","FreethiMutta"};
        ArraysUpdate up=new ArraysUpdate();
        System.out.println("Before Update Of Array:"+Arrays.toString(Details));
        Scanner scan=new Scanner(System.in);
        System.out.println("Total Length of Array :"+(Details.length-1));
        int index=scan.nextInt();
        System.out.println("You are Selected Position "+index +"Position values " +Details[index]);
        System.out.println("Please Enter New Name:");
        String name=scan.next();
        Details[index]=name;
        System.out.println("After Update Values is:"+Arrays.toString(Details));

    }
}
