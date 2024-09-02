package Fundamentals.Exception_Handling;

import java.io.IOException;

public class Compiletime
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Runtime run=Runtime.getRuntime();//syntax
        Process pro;
        pro=run.exec("Notepad");
        Thread.sleep(5000);
        pro=run.exec("Excel");
    }
}
