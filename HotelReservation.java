import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CodeAlpha Hotel Reservation System ---");
        
        System.out.println("1. View Available Rooms");
        System.out.println("2. Make a Reservation");
        System.out.println("3. Exit");
        System.out.print("Option-ah select pannunga: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nRooms Available:");
            System.out.println("- Luxury Suite (Rs. 5000)");
            System.out.println("- AC Deluxe (Rs. 3000)");
            System.out.println("- Non-AC Standard (Rs. 1500)");
        } else if (choice == 2) {
            System.out.print("\nEnter Name: ");
            String name = sc.next();
            System.out.print("Enter Room Type (Luxury/AC/Standard): ");
            String room = sc.next();
            System.out.println("\nSuccess! Room booked for " + name);
            System.out.println("Room Category: " + room);
            System.out.println("Payment Status: Pending at Counter");
        } else {
            System.out.println("Thank you!");
        }
        
        sc.close();
    }
}