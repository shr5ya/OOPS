class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("'" + title + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("'" + title + "' is currently not available.");
        }
    }

    public void displayDetails() {
        String status = availability ? "Available" : "Not Available";
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + String.format("%.2f", price) + ", Status: " + status);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Python Crash Course", "Eric Matthes", 25.99, true);
        book.displayDetails();

        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();
        book.displayDetails();

        System.out.println("\nAttempting to borrow the same book again...");
        book.borrowBook();
    }
}
