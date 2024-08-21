package Fundamentals.ArrayCreation;
public class DemoArray
{
    public static void main(String[] args)
    {
      //  char []arr = {'s', 'e', 'b', 'u', 'm'};                -to string method
      //  System.out.println(Arrays.toString(arr));
       // String []array=new String[3];                          -for loop
      //  array[0]="SIVA";
       // array[1]="PREETHI";
       // array[2]="SANKARI";
     //  for(int i=0;i<array.length;i++)
      // {
      //     System.out.println(array[i]);
      // }


        String []array={"VALLI","SHYAM","MARAN","MOZHI"};
        for(String array1:array)                               //-using for each to print the array values.
        {
            System.out.println(array1);
        }
    }
}


