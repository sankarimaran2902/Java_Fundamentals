package Fundamentals.Oops_Abstraction;

public class Car_Abstractionaccess extends Car_Abstraction
{
    @Override
    public void brake() {
        System.out.println("Brake is Applied to stop the car");
    }

    @Override
    public void gear() {
     System.out.println("Level up the speed from 1 to 5 ");
    }

    @Override
    public void clutch() {
        System.out.println("Allowing the Driver to change the gears");
    }
    public static void main(String[] args)
    {
        Car_Abstractionaccess ca=new Car_Abstractionaccess();
        ca.accelerator();
        ca.brake();
        ca.clutch();
        ca.gear();
    }
}
