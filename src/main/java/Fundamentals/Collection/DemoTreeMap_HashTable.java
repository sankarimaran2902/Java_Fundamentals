package Fundamentals.Collection;
import java.util.Hashtable;
import java.util.TreeMap;

public class DemoTreeMap_HashTable
{
    public static void main(String[] args) {
        //Key class as Name and Value Class as Mobile Phones.
        TreeMap<String,MobilePhones> obj=new TreeMap<String,MobilePhones>();
        MobilePhones mob1=new MobilePhones("iphone",8,105000.25);
        MobilePhones mob2=new MobilePhones("Lenovo",4,10000.50);
        MobilePhones mob3=new MobilePhones("Redmi9Pro",8,15000.25);
        obj.put("Saran",mob1);
        obj.put("Valli",mob2);
        obj.put("Siva",mob3);
        obj.put("Shobana",mob3);
        obj.put("Mozhi",mob2);
        System.out.println(obj);
//It has key class as MobilePhones and Value class as String names (o/p=In different Format)
        Hashtable<MobilePhones, String> obj1=new Hashtable<MobilePhones,String>();
        obj1.put(mob3,"Raghu");
        System.out.println(obj1);

    }
}

