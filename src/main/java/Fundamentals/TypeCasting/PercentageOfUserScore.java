package TypeCasting;

public class PercentageOfUserScore
{
    public static void main(String[] args)
    {
        int userScore = 459;
        int maximumScore = 500;
        float percentage = (float) userScore / maximumScore * 100f;
        System.out.println("Percentage of User score is:" + percentage);
    }
}



