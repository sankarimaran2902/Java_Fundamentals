package Fundamentals.Oops_Inheritance;
class BiriyaniShop
{
    public void food()
    {
        String breakFast="Dosa";
        String lunch="Chicken Briyani";
        String dinner="Chapati";
        System.out.println("My Fav Foods are:"+lunch +","+dinner +" and "+breakFast);
    }
}
class BakkeryShop extends BiriyaniShop {
    public void snacks()
    {
        String hotSnacks="Puffs";
        String coldSnacks="MilkShakes";
        String packedSnacks="Biscuits";
        System.out.println("My Fav Snacks are:"+hotSnacks +"," +coldSnacks +" and " +packedSnacks);
    }
}
class FruitShop extends BakkeryShop {
    public void juices()
    {
        String fruit="Apple";
        String fruit1="Watermelon";
        String fruit2="Pine Apple";
        System.out.println("My Fav Fruits are:"+fruit +","+fruit1 +" and " +fruit2);
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        FruitShop fs = new FruitShop();
        fs.food();
        fs.snacks();
        fs.juices();
    }
}
