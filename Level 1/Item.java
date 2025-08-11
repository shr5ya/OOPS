public class Item {
    String itemCode;
    String itemName;
    double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.printf("Price per unit: $%.2f\n", this.price);
    }

    public double calculateTotalCost(int quantity) {
        return this.price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item("LAP001", "Laptop", 1200.00);
        item1.displayDetails();
        int quantity1 = 2;
        double totalCost1 = item1.calculateTotalCost(quantity1);
        System.out.printf("Total cost for %d units: $%.2f\n", quantity1, totalCost1);
    }
}