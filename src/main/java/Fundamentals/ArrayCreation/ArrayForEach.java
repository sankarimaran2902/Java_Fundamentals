package Fundamentals.ArrayCreation;
import java.util.Arrays;
public class ArrayForEach {
    public static void main(String[] args) {
        String Collegename[] = {"Saranathan", "PSG", "NIT", "Sastra", "Mahalingam"};
        //Syntax:for(variablename:Arrayname)
        //       {block of code}
        for (String clgname : Collegename)             //It executes the Array value using ForEach
        {
            System.out.println(clgname);
        }
    }
}
