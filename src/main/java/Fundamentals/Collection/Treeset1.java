package Fundamentals.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<MobilePhones> poorvika = new TreeSet<>();
        poorvika.add(new MobilePhones("iPhone",8,98000.99));
        poorvika.add(new MobilePhones("Realme",4,17800.65));
        poorvika.add(new MobilePhones("Samsung", 1, 5800.89));
        poorvika.add(new MobilePhones("Sony", 6, 47800.89));
        poorvika.add(new MobilePhones("onePLus", 8, 57800.89));

        MobilePhones obj=new MobilePhones("Lenovo",5,30000.50);
        poorvika.add(obj);
        Iterator<MobilePhones> i=poorvika.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
class MobilePhones implements Comparable<MobilePhones>
{
    String mobileName;
    Integer ramSize;
    Double price;
    public MobilePhones(String mobileName,Integer ramSize,Double price)
    {
        this.mobileName=mobileName;
        this.ramSize=ramSize;
        this.price=price;
    }
    public String toString()
    {
        return "MobilePhones[mobileName="+mobileName +","+"ram=" +ramSize +"," +"price=" +price +"]";

    }

    @Override
    public int compareTo(MobilePhones o) {
        return o.price.compareTo(this.price);
    }
}