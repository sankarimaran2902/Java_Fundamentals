package Fundamentals.Looping;
import java.util.Scanner;
public class DemoLooping
{
        public  static  void ExecuteLooping(int value) {
            Scanner ss = new Scanner(System.in);
            System.out.println("what is your age");
            int age = ss.nextInt();
            int number = value;
            for(;number<=5; number++)
            {
                if(number==1)
                {
                    if(age==18)
                    {
                        System.out.println("Age :"+age);
                    }
                    else
                    {
                        System.out.println("You age is less than 18 or equal");
                    }
                } else if (number==2) {
                    System.out.println("Number is"+number);

                }
                System.out.println(number+"chance over more than chance"+(5-number));
            }

        }


        public static void main(String[] args) {
            ExecuteLooping(1);
        }
    }

