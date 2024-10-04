package Fundamentals.Collection;
import java.util.ArrayList;
import java.util.Vector;
public class Vector_ArrayList
{
    public static void main(String[] args)
    {
      ArrayList l1=new ArrayList();
      l1.add("Saran");
      l1.add("Shobana");
      l1.add("Arul");
      l1.add("Karthik");
      l1.add(22);
      l1.add(21);

        Vector vv=new Vector();
        vv.addAll(l1);
        vv.add("Siva");
        vv.add("Sankari");
        System.out.println("Array List:"+l1);
        System.out.println("Vector List:"+vv);

        //remove
        vv.remove("Karthik");
        System.out.println("Remove Array or Vector:"+vv);

        //removeAll
        vv.removeAll(l1);
        System.out.println("remove"+vv);

        //retainAll
        vv.retainAll(l1);
        System.out.println("Retain:"+vv);

    }
}
