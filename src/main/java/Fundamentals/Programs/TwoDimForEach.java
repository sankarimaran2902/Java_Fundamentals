package Fundamentals.Programs;

public class TwoDimForEach
{
    public static void main(String[] args)
    {
        int[][] myNumbers={{1,2,3,4,5},{6,7,8,9,10}};
        for(int[] Num:myNumbers)
        {
            for(int i:Num)
            {
                System.out.println(i);
            }
        }
    }
}
