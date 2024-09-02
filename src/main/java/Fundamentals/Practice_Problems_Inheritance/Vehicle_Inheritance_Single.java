package Fundamentals.Practice_Problems_Inheritance;
class Vehicle
{
    public void drive()
    {
        System.out.println("All vehicles are movable");
    }
}
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class Vehicle_Inheritance_Single {
    public static void main(String[] args)
    {
        Vehicle vi=new Vehicle();
        vi.drive();
        Car cr=new Car();
        cr.drive();
    }
}
