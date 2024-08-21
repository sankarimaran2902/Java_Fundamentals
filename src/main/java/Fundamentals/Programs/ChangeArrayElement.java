package Fundamentals.Programs;
import java.util.Arrays;
public class ChangeArrayElement
{
    public static void main(String[] args)
    {
        String[] name={"Siva","Saranya","Sankari"};
        name[2]="Valli";
        System.out.println(name[2]);
        System.out.println(Arrays.toString(name));
    }
}
