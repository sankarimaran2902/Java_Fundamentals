package Fundamentals.Oops_Inheritance;
 class Shop
{
    public void Fruits()
    {
        String food="Apple";
        String food1="Grapes";
        System.out.println("My Fav Fruits are:"+food+ " and " +food1);
    }

}
public class Sample_Single_Inheritance extends Shop
{
    public void Choci()
    {
        String choco="Ferro";
        String choco1="Dairy";
        System.out.println("My fav chocolates are:" +choco+ " and " +choco1);
    }
    public static void main(String[] args)
    {
        Sample_Single_Inheritance ssi=new Sample_Single_Inheritance();
        ssi.Fruits();
        ssi.Choci();
    }

}
