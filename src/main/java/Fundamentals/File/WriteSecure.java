package Fundamentals.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class WriteSecure //Encrypted form of output-because of deflater
{
    public static void main(String[] args) throws IOException
    {
        
        File ff=new File("C:\\Users\\sivas\\sankari.txt");
        FileOutputStream os=new FileOutputStream(ff);
        DeflaterOutputStream dos=new DeflaterOutputStream(os);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Text");
        String data=scan.nextLine();
        dos.write(data.getBytes());
        System.out.println(ff.getName()+"File Write Secure has been Created successfully");
        dos.close();
        os.close();

    }
}
