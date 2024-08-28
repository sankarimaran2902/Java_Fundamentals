package Fundamentals.String_Methods;

public class StringBuffer1
{
    public static void main(String[] args)
{
   StringBuffer ss=new StringBuffer("Valli");
   //Append
    System.out.println(ss);
    System.out.println(ss.append("Sivasankari"));
    //Insert
    System.out.println(ss.insert(5,"Saranya"));
    //Replace
    ss.replace(5,6,"Shobana");
    System.out.println(ss);
    //Delete
    ss.delete(1,3);
    System.out.println(ss);
    //Reverse
    ss.reverse();
    System.out.println(ss);
}
}
