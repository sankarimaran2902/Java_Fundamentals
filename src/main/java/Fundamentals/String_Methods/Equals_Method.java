package Fundamentals.String_Methods;

public class Equals_Method
{
    public static void main(String[] args)
    {
        String name="Saran";
        String name1="Shobana";
        String name2="saran";
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name==name2);
    }
}
