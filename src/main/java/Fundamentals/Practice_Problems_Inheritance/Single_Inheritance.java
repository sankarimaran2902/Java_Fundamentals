package Fundamentals.Practice_Problems_Inheritance;
class Animal
{
    public void makeSound()
    {
        System.out.println("The animal makes a sound.");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}
public class Single_Inheritance
{
  public static void main(String[] args)
{
    Animal ai=new Animal();
    ai.makeSound();
    Cat ci=new Cat();
    ci.makeSound();
}
}
