package Fundamentals.TypeCasting;
public class DemoTypeCasting
{
    public static void main(String[] args) {
        //Changing the one datatype to another datatype-TypeCasting
        //Widening Typecasting(Small datatypes to Large Datatypes)
        char sweet='R';
        int delicious=sweet;
        System.out.println("Sweet is :"+delicious);
        //Narrowing Typecasting(Large Datatypes to Small Datatypes)
        double weight=50.585;
        int myweight=(int)weight; //datatype variable=(type conversion)variable;-Narrowing casting
        System.out.println("My weight:"+myweight);
        long mblno=9688193688l;
        int covertlong=(int) mblno;
        System.out.println("MOBILE  NUMBER:"+covertlong);
        int number=65;
        char value=(char)number;
        System.out.println("Char value is :"+value);


    }
}
