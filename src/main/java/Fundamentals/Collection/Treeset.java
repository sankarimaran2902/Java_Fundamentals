package Fundamentals.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset        //Order=Not maintained.
{                           //Duplicates=Not Allowed.
    public static void main(String[] args) {
        //TreeSet(Set)
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Preethi");
        ts.add("Sivasankari");
        ts.add("Saranya");
        ts.add("Shobana");
        System.out.println(ts);

        //HashSet(Set)
        HashSet<String> hs=new HashSet<String>();
        hs.addAll(ts);

        //Syntax for Iterator
        //Iterator username=collectionname.iterator();
        Iterator<String> it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next() +"Hash set Values");
        }

    }
}
