package Fundamentals.Programs;

public class TwoDimChange
{
    public static void main(String[] args)
    {
       String[][] name={{"Siva","Saranya","Shobana","Sakthi"},{"Mozhi","Kajal","Arun","Jeni"}};
       name[0][3]="Selvam";
       System.out.println(name[0][3]);  //output-Selvam(Instead of Sakthi)
    }
}
