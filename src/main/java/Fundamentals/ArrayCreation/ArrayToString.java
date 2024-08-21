package Fundamentals.ArrayCreation;
import java.util.Arrays;
public class ArrayToString
{
    public static void main(String[] args) {
        String collegeName[]={"Saranathan","Ramakrishna","MAM","Anjalaiyammal","NIT"};
      //  System.out.println("College Name:"+collegeName);//It gives address
          System.out.println(Arrays.toString(collegeName));//To print the array values using Arrays.tostring(ArrayName);
          System.out.println("Length Of Array:"+collegeName.length);//ArrayName.length-It gives length of array.
          System.out.println(collegeName[4]);// ArrayName[IndexValue]-It gives the particular index array values.

    }
}
