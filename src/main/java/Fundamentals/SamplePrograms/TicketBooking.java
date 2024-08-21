package Fundamentals.SamplePrograms;
import java.util.Scanner;
import java.lang.String;
public class TicketBooking
{
    public void Features(String selectFeatures )
    {
        if (selectFeatures.equalsIgnoreCase("Normal"))
        {
            System.out.println("Normal Seat Cost Price-$150");
        }
        else if (selectFeatures.equalsIgnoreCase("Premium"))
        {
            System.out.println("Premium Seat Cost Price-$350");
        }
        else if (selectFeatures.equalsIgnoreCase("Delux"))
        {
            System.out.println("Delux Seat Cost Price-$600");
        }
        else
        {
            System.out.println("Invalid Features Selected");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicketBooking booking=new TicketBooking();
        int numberOfseatsAvailable = 10;
        System.out.println("Welcome to Theatre Ticket Booking");
        System.out.println("Enter Your Mobile Number:");
        long mobileNumber = scan.nextLong();
        System.out.println("Enter your Email Id:");
        String emailId = scan.next();
        System.out.println("Enter the Number of Seats");
        int numberOfSeats = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= numberOfseatsAvailable; i++) {
            System.out.println("Seats available at: " + i);

        }
        System.out.println("Enter the Features you want(Normal,premium,Delux):");
        String selectFeatures=scan.nextLine();
        booking.Features(selectFeatures);

    }
}