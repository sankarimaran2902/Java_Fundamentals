package Fundamentals.Programs;
public class ForEachExample
{
    public static void main(String[] args)
    {
        int[][] myNumber={{10,20,30},{40,50,60}};
        for(int[] num:myNumber)
        {
            for(int i:num)
            {
                System.out.println(i);
            }
        }
    }
}
