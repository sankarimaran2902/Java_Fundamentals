package Fundamentals.Oops_Polymorphism_Overiding;

public class BankAccess
{
        public static void main(String[] args) {
            //Upcasting
            OveridingBank_Polymorphism ob= new OveridingBank_Polymorphism();
            System.out.println(ob.getrateofinterest());
            OveridingBank_Polymorphism bb1= new Hdfc_Bank();
            System.out.println(bb1.getrateofinterest());
            OveridingBank_Polymorphism bb2= new OveridingBank_Polymorphism();
            System.out.println(bb2.getrateofinterest());

        }
}

