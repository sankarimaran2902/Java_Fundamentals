package Fundamentals.Oops_Inheritance;
class FoodHotels                                    //Multilevel Inheritance Explicited
    {
        public void kms()
        {
            String food="Briyani";
            String food1="Pizza";
            System.out.println("My fav food is:"+food);
            System.out.println("My fav food is:"+food1);
        }
    }
    class FoodHotels1 extends FoodHotels
    {
        public void bananaleaf()
        {
            String recipe="Chilli chicken";
            String recipe1="Fried Rice";
            System.out.println("My Fav Recipe is:"+recipe);
            System.out.println("My Fav Recipe is:"+recipe1);
        }
    }
    class FoodHotels2 extends FoodHotels1
    {
        public void dindugal()
        {
            String chicken="Chicken Briyani";
            String mutton="Mutton Briyani";
            System.out.println("My Fav Briyani is:"+chicken);
            System.out.println("My Fav Briyani is:"+mutton);
        }
    }
public class Sample_Multilevel_Inheritance
    {
        public static void main(String[] args)
        {

            FoodHotels2 fh=new FoodHotels2();
            fh.kms();
            fh.bananaleaf();
            fh.dindugal();


        }
    }


