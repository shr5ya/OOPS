class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // 1. Default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();
        System.out.println();

        // 2. Parameterized constructor
        HotelBooking paramBooking = new HotelBooking("Bob", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBooking();
        System.out.println();

        // 3. Copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copy Booking:");
        copyBooking.displayBooking();
    }
}
