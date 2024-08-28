package Fundamentals.Oops_Inheritance;
    class Management
    {
        public void Manage()
        {
            System.out.println("Nothing more than Happiness");
        }
    }
    class Hod extends Management{
        public void Details()
        {
            System.out.println("CSE Department HOD:SIVA SANKARI");
            System.out.println("EEE Department HOD:PREETHI");
        }
    }
    class Advisor extends Hod{
        public void A_Details()
        {
            System.out.println("CSE advisor:ANTONY");
            System.out.println("EEE advisor:SHAM");
        }
    }
    public class Multilevel_Inheritance1
    {
        public static void main(String[] args)
        {
            Advisor ai=new Advisor();
            ai.Manage();
            ai.Details();
            ai.A_Details();
        }
    }

