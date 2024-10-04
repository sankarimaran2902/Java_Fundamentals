package Fundamentals.Collection;
import java.util.TreeMap;
public class Treemap    //Order=Not Maintained
{                       //Duplicates=(Duplicates Allowed only on Value Class.)
                        //Value class Can be Duplicate,but Key Class should not be Duplicate.

    public static void main(String[] args) {
        //TreeMap
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
        tm.put("Sankari",501);
        tm.put("Preethi",502);
        tm.put("Siva",503);
        tm.put("Saran",504);
        tm.put("Priya",503);
        System.out.println(tm);
        System.out.println(tm.get("Saran"));
        System.out.println(tm.containsKey("Siva"));
        System.out.println(tm.containsValue(503));
    }
}
