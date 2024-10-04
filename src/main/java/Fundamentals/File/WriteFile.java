package Fundamentals.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile
{
    public static void main(String[] args) throws IOException
    {
        File ff=new File("C:\\Users\\sivas\\sankari.txt");
        FileOutputStream fs=new FileOutputStream(ff);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Text File");
        String writefile=scan.nextLine();
        fs.write(writefile.getBytes());
        System.out.println(ff.getName()+"File has been Write Successfully");
    }
}
