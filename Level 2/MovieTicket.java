public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "N/A";
        this.price = 0.0;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie: " + this.movieName);
        System.out.println("Seat Number: " + this.seatNumber);
        System.out.printf("Price: $%.2f\n", this.price);
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");
        ticket1.displayDetails();
        System.out.println();
        ticket1.bookTicket("A12", 15.50);
        ticket1.displayDetails();
    }
}