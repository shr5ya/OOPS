class CarRental {
    public static final double DAILY_RATE = 50.0;

    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Charlie", "Toyota Corolla", 7);
        rental1.displayRentalDetails();

        System.out.println();

        CarRental rental2 = new CarRental("David", "Ford Mustang", 3);
        rental2.displayRentalDetails();
    }
}
