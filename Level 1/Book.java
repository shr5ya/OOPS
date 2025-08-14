class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    public Book() {
        this("Unknown Title", "Unknown Author", 0.0);
        System.out.println("Default constructor called.");
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called.");
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        System.out.println("--- Book Class ---");
        // Using the default constructor
        Book book1 = new Book();
        System.out.println("Default Book:");
        book1.displayDetails();

        System.out.println();

        // Using the parameterized constructor
        Book book2 = new Book("The Hello Kitty", "Shreya", 12.50);
        System.out.println("Parameterized Book:");
        book2.displayDetails();
    }
}