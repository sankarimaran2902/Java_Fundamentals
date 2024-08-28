package Fundamentals.Multiple_Inheritance;

public class Multiple_Inheritance1 implements mall,mall1,mall2
{
  public void MarinaMall()
  {
      System.out.println("World Tallest Mall");
  }

    @Override
    public void DMart() {
        System.out.println("D_mart has many Offers in All Seasons");
    }

    @Override
    public void Reliance() {
           System.out.println("Reliance Owner is Ambani");
    }

    @Override
    public void Cholan() {
      System.out.println("Native mall in mannai");

    }
    public static void main(String[] args)
    {
        Multiple_Inheritance1 mi=new Multiple_Inheritance1();
        mi.MarinaMall();
        mi.DMart();
        mi.Reliance();
        mi.Cholan();
    }
}

