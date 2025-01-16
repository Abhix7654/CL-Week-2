public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " (Seat: " + seatNumber + ")");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

  }
 import java.util.Scanner;

// Main method for testing
class Main{
  // Main method to test the MovieTicket system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating sample movie tickets
        MovieTicket ticket1 = new MovieTicket("Avatar: The Way of Water", "A1", 12.50);
        MovieTicket ticket2 = new MovieTicket("Oppenheimer", "B3", 15.00);

        // Simulating ticket booking system
        int choice;
        do {
            System.out.println("\nMovie Ticket Booking System:");
            System.out.println("1. Display Ticket 1 Details");
            System.out.println("2. Display Ticket 2 Details");
            System.out.println("3. Book Ticket 1");
            System.out.println("4. Book Ticket 2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ticket1.displayTicketDetails();
                    break;
                case 2:
                    ticket2.displayTicketDetails();
                    break;
                case 3:
                    ticket1.bookTicket();
                    break;
                case 4:
                    ticket2.bookTicket();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Movie Ticket Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

