package Fundamentals.Multiple_Inheritance;

public class Demo_Multiple_Inheritance implements food,food1,food2
{
    public void japanFood()
    {
        System.out.println("Very Healthy");
    }

    @Override
    public void traditionalFoods() {
        System.out.println("Raagi is the Healthy food in Traditional foods");
    }

    @Override
    public void fastFood() {
        System.out.println("Chicken Fried is very Bad for Health");

    }

    @Override
    public void withoutFireFoods() {
        System.out.println("Nutrient Rich food");
    }
    public static void main(String[] args)
    {
        Demo_Multiple_Inheritance dmi=new Demo_Multiple_Inheritance();
        dmi.japanFood();
        dmi.traditionalFoods();
        dmi.fastFood();
        dmi.withoutFireFoods();
    }
}
