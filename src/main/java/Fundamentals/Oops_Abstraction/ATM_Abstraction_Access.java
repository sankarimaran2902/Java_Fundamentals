package Fundamentals.Oops_Abstraction;

public class ATM_Abstraction_Access extends ATM_Machine_Abstraction
{
    @Override
    public void moneytransfer() {
        System.out.println("Upto 50K transfer per day");
    }

    @Override
    public void ministatement() {
        System.out.println("Histories are easy accessible");

    }

    @Override
    public void balance() {
        System.out.println("Balance in your account is 5000");

    }
    public static void main(String[] args)
    {
        ATM_Abstraction_Access aa=new ATM_Abstraction_Access();
        aa.cashwithdrawal();
        aa.moneytransfer();
        aa.ministatement();
        aa.balance();
    }
}
