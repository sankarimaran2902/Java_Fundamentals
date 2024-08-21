package Fundamentals.ArrayCreation;
import java.util.Arrays;
public class ArrayForLoop
{
    public static void main(String[] args)
    {
        String collegeName[]={"Saranathan","KRC","NIT","Sastra","Mahalingam"};
        for(int start=0;start<collegeName.length;start++)//It executes arrays values using looping concepts
        {
            System.out.println(collegeName[start]);
        }
    }
}
