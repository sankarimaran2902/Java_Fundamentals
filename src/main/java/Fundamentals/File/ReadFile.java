package Fundamentals.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args) throws IOException
    {
        File ff=new File("C:\\Users\\sivas\\sankari.txt");
        FileInputStream is=new FileInputStream(ff);
        int size=is.available();
        //System.out.println(size);
        byte[] getting=new byte[size];
        is.read(getting);
       // System.out.println(getting);
        String obj=new String(getting);
        System.out.println(obj);
    }
}
