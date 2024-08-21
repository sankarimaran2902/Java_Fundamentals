package Fundamentals.Fundamentals;

public class swapingOfTwoVariables
{
    public static void main(String[] args){
        int pizza=50;
        int chicken=25;
        System.out.println("Before Swapping:" +pizza  +","  +chicken);
        int temp=pizza;
        pizza=chicken;
        chicken=temp;

        System.out.println("After Swapping: "+pizza  +","+chicken);
    }
}
