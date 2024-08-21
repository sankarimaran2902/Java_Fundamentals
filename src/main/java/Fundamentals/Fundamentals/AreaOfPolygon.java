package Fundamentals.Fundamentals;
import java.util.Scanner;
public class AreaOfPolygon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sides on polygon:");
        Double ns = scan.nextDouble();
        System.out.println("Enter the length of one of the sides:");
        Double ls = scan.nextDouble();
        double areaOfPolygon = (ns * (ls*ls)) / (4 * Math.tan(Math.PI / ns));
        System.out.println("Area of Polygon:" + areaOfPolygon);

    }
}
