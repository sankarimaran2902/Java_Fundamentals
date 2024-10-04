package Fundamentals.File;
import java.io.File;
import java.io.IOException;

public class Filecreate
{
    public static void main(String[] args) throws IOException
    {
        File ff=new File("C:\\Users\\sivas\\sankari.txt");
        ff.createNewFile();
        System.out.println(ff.getName()+"File has been created Successfully. ");
    }
}
