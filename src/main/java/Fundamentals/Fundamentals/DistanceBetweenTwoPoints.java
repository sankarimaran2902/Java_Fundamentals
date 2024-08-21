package Fundamentals.Fundamentals;
import java.util.Scanner;
public class DistanceBetweenTwoPoints
{
    public static void main(String[] args)
    {
        Scanner gather=new Scanner(System.in);
        System.out.println("Enter the Input Latitude of coordinate 1:");
        double lat1=gather.nextDouble();
        System.out.println("Enter the Input Longitude of coordinate 1:");
        double lon1=gather.nextDouble();
        System.out.println("Enter the Latitude of Coordinate 2:");
        double lat2=gather.nextDouble();
        System.out.println("Enter the Longitude of Coordinate 2:");
        double lon2=gather.nextDouble();
        System.out.println("The distance between those points is:"+distance_Between_LatLong(lat1,lon1,lat2,lon2)  +"km\n");
    }
    public static double distance_Between_LatLong(double lat1,double lon1,double lat2,double lon2)
    {
        lat1=Math.toRadians(lat1);
        lon1=Math.toRadians(lon1);
        lat2=Math.toRadians(lat2);
        lon2=Math.toRadians(lon2);
        double earthRadius=6371.01;
        return earthRadius*Math.acos(Math.sin(lat1)* Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));
    }
}
