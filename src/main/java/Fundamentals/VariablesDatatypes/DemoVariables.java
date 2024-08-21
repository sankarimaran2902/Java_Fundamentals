package Fundamentals.VariablesDatatypes;
public class DemoVariables
{
    String employeeName2="Priya";//Global Variables
    static String employee_name="Sathish"; //static variables
    public void Details()          //Local Variables
    {
        String employeeName1="Annamalai";
        System.out.println("My First Employee Name is:" +employeeName1);
        System.out.println("My second Employee Name is:" +employeeName2);
        System.out.println("Hello");
    }
    public static void main(String[] args)
    {
        //Object Creation:
        //syntax
        //classname objectname= new classname();
        DemoVariables gather=new DemoVariables();
        //objectname.methodname
        gather.Details();
        String companyName="Zealous Tech Corp";//Instance Variable
        System.out.println("My company name is:"+companyName);
        System.out.println("My Employee Name is:"+employee_name);
    }
    static
    {
        System.out.println("Welcome to Zealous Tech Corp");
    }
}
