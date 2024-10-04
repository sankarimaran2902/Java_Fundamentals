package Fundamentals.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class ReadSecure
{
    public static void main(String[] args) throws IOException
    {

        File ff=new File("C:\\Users\\sivas\\sankari.txt");
        FileInputStream is=new FileInputStream(ff);
        InflaterInputStream ifi=new InflaterInputStream(is);
        int size=is.available();
        byte ss[]=new byte[size];
        ifi.read(ss);
        String obj=new String(ss);
        System.out.println(obj);
        ifi.close();
        is.close();

    }
}
