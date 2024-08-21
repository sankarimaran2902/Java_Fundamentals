package Fundamentals.Looping;
public class DemoReverse {
    public static void main(String[] args) {
        int number = 12345, reverse = 0;
        while (number != 0) {
            int digitScore = number % 10;          //12345%10=1234
            reverse = reverse * 10 + digitScore;   //rev=0*10+1234
            number = number / 10;                  //number=12345/10=1234
        }
        System.out.println(number + "Reversed Number is " + reverse);
    }
}




