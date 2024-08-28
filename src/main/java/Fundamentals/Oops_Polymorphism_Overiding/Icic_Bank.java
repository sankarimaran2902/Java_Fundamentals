package Fundamentals.Oops_Polymorphism_Overiding;

public class Icic_Bank extends OveridingBank_Polymorphism
{
        public  int getrateofinterest()
        {
            return 9;
        }

        public static void main(String[] args) {
            Icic_Bank ic= new Icic_Bank();
            System.out.println(ic.getrateofinterest());
            OveridingBank_Polymorphism ob= new OveridingBank_Polymorphism();
            System.out.println(ob.getrateofinterest());
            Hdfc_Bank hd= new Hdfc_Bank();
            System.out.println(hd.getrateofinterest());
        }
    }

