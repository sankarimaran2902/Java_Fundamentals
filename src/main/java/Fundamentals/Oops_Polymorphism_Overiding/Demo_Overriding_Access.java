package Fundamentals.Oops_Polymorphism_Overiding;

public class Demo_Overriding_Access
{
    public static void main(String[] args)
    {
        Demo_Overriding dore=new Demo_Overriding();
        dore.district_name("Trichy","Thiruverumbur");
        Demo_Overriding2 dor=new Demo_Overriding2();
        dor.district_name("Trichy","Thanjavur");
    }

}
