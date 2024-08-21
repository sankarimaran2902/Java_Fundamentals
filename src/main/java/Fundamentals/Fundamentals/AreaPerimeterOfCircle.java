package Fundamentals.Fundamentals;

public class AreaPerimeterOfCircle
{
    private static final double radius=7.5;
    public static void main(String[] args){
        double areaOfCircle=Math.PI*radius*radius;
        double perimeterOfCircle=2*Math.PI*radius;
        System.out.println("Area of Circle:"+areaOfCircle);
        System.out.println("Perimeter of Circle:"+perimeterOfCircle);
    }
}
