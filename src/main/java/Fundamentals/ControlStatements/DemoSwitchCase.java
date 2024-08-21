package Fundamentals.ControlStatements;
import java.util.Scanner;
public class DemoSwitchCase
{
  public static void main(String[] args)
  {
      Scanner gather=new Scanner(System.in);
      System.out.println("Enter the Vowels");
      String vowels=gather.next();
      switch(vowels)
      {
          case "A":
              System.out.println("A is a Vowel");
              break;
          case "E":
              System.out.println("E is a Vowel");
              break;
          case "I":
              System.out.println("I is a Vowel");
              break;
          case "O":
              System.out.println("O is a Vowel");
              break;
          case "U":
              System.out.println("U is a Vowel");
              break;
          default:
              System.out.println("Not a Vowel");

      }
  }
}
