package Fundamentals.Oops_Polymorphism_Overiding;

public class Demo_Overriding2
{
    public void district_name(String district1,String district2)
    {
        if(district1=="Trichy")
        {
            System.out.println("Famous for Mallai kottai");
        }
        else if(district2=="Tiruvarur")
        {
            System.out.println("Famous for Temples");
        }
        else {
            System.out.println("Not Valid");
        }
    }
}
