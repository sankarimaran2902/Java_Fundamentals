package Fundamentals.ArrayCreation;
import java.util.Arrays;
public class ArrayFacePatternForLoop
{
    public static void main(String[] args) {
        // Create an array to store lines of an ASCII art representation
        String[] face=new String[5];
        // Populate the array with lines to form an ASCII art representation of a simple face
        face[0]=" +\"\"\"\"\"+";
        face[1]="[| o o |]";
        face[2]=" |  ^  |";
        face[3]=" | '-' |";
        face[4]=" +-----+";
        // Use a loop to print each line of the ASCII art representation
        for(int i=0;i<face.length;i++)
        {
            System.out.println(face[i]);
        }
    }
}
