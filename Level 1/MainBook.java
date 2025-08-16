public class MainBook {
    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java Basics", "James", "PDF");
        eb.displayDetails();

        eb.setAuthor("Martin");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + getAuthor() +
                           ", Format: " + format);
    }
}
