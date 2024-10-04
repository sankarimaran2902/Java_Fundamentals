package Fundamentals.String_Methods;

public class StringBuffer1
{
    public static void main(String[] args)
{
   StringBuffer ss=new StringBuffer("Valli");
   //Append
    System.out.println(ss);//valli
    System.out.println(ss.append("Sivasankari"));//Append Means joins two string(First-Valli ;next-Sivasankari=ValliSivasankari)
    //Insert
    System.out.println(ss.insert(5,"Saranya"));//End of valli '5' index insert Saranya=ValliSaranyaSivasankari
    //Replace
    ss.replace(5,6,"Sobana");
    System.out.println(ss);
    //Delete
    ss.delete(1,3);
    System.out.println(ss);
    //Reverse
    ss.reverse();
    System.out.println(ss);
}
}
