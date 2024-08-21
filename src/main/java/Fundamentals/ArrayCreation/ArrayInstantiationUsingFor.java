package Fundamentals.ArrayCreation;
import java.util.Arrays;
public class ArrayInstantiationUsingFor
{
    public static void main(String[] args) {
        char[] initial=new char[5];
             initial[0]='S';
             initial[1]='D';
             initial[2]='R';
             initial[3]='K';
             initial[4]='J';
             for(int i=0;i<initial.length;i++)
             {
                 System.out.println(initial[i]);
             }
    }
}
