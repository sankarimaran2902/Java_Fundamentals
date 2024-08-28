package Fundamentals.Oops_Inheritance;
class Reliance //Hierarchical Main Disadvantage is We have to create objects for calling each methods.
{
    public void sections()
    {
        System.out.println("Groceries Items");
        System.out.println("Medicine Items");
        System.out.println("Clothing Items");
    }
}
class GroceriesItems extends Reliance{
    public void spices()
    {
         String item="Chilli";
         String item1="Corainder";
         System.out.println("Best Spices in India:"+item +" and "+item1);
    }
}
class MedicineItems extends Reliance{
    public void tablets()
    {
        String dose="Dolo";
        String dose1="Paracetamol";
        System.out.println("Tablets for fever and Headache:"+dose +" and "+dose1);
    }
}
class ClothingItems extends Reliance{
    public void trends()
    {
        String dress="Salwar";
        String dress1="Dhoti";
        System.out.println("Dress Available at Trends:"+dress +" and "+dress1);
    }
}
public class Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        ClothingItems ci=new ClothingItems();
        ci.sections();
        ci.trends();
        GroceriesItems gi=new GroceriesItems();
        gi.spices();
        MedicineItems mi=new MedicineItems();
        mi.tablets();

    }
}
