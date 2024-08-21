package Fundamentals.Operators;

public class DemoLogical
{
        public static void main(String[] args)
        {
            String district="salem";
            String district1="salem";
            String district2="Yercaud";
            System.out.println((district==district1)&&(district1==district2)); //Both condition satisfy
            System.out.println((district==district1)||(district==district2));  //Any one condition satisfy
            int cosmno=25;
            int beta=10;
            System.out.println(!(cosmno==beta)); //Opposite condition satisfy


        }
}
