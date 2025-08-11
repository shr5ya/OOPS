import java.util.ArrayList;
import java.util.List;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        this.items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        this.items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public void displayTotalCost() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.printf("Total cost of the cart: $%.2f\n", total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartItem item1 = new CartItem("Laptop", 1200.00, 1);
        CartItem item2 = new CartItem("Mouse", 25.50, 2);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayTotalCost();
        
        System.out.println();
        
        cart.removeItem("Laptop");
        cart.displayTotalCost();
    }
}