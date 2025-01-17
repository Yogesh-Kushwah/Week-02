// Class to represent a Movie Ticket Booking System
class MovieTicket {

    String movieName;    // Name of the movie
    int seatNumber;      // Seat number for the ticket
    int price;           // Price of the ticket

    // Constructor to initialize the movie ticket with the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;  // Set the movie name
        this.seatNumber = 0;         // Default seat number
        this.price = 0;              // Default ticket price
    }

    // Method to book a ticket by specifying seat number and price
    public void bookTicket(int seatNumber, int price) {
        this.seatNumber = seatNumber;  // Set the seat number for this ticket
        this.price = price;            // Set the price for this ticket

        System.out.println("Ticket booked successfully!");  // Confirmation message
    }

    // Method to display the ticket details
    public void display() {
        if (seatNumber == 0) {  // Check if no ticket has been booked
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println(" MovieName: " + movieName + " | SeatNumber: " + seatNumber + " | Price: " + price);
        }
    }
}

public class Ticket {
    public static void main(String[] args) {
        // Create the first ticket for the movie "Bahubali"
        MovieTicket ticket = new MovieTicket("Bahubali");

        // Create another ticket for the movie "Bahubali"
        MovieTicket ticket1 = new MovieTicket("Bahubali");

        // Book the first ticket with seat number 1 and price 100
        ticket1.bookTicket(1, 100);

        // Book another ticket with seat number 1 and price 200
        ticket.bookTicket(1, 200);

        // Display details for the first ticket
        ticket1.display();

        // Display details for the second ticket
        ticket.display();
    }
}
