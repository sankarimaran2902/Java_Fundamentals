package Fundamentals.Practice_Problems_Inheritance;
class Shape
{
    public void getArea()
    {
        System.out.println("Number of shapes available");
    }
}
class Rectangle extends Shape{
    @Override
    public void getArea() {
        int length=5;
        int width=3;
        int area=length*width;
        System.out.println("Area of Rectangle (5*3):"+area);
    }
}
public class AreaOfRectangle {
    public static void main(String[] args)
    {
        Shape sp=new Shape();
        sp.getArea();
        Rectangle re=new Rectangle();
        re.getArea();
    }
}
