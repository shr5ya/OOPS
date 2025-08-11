public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposited: $%.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("Withdrew: $%.2f\n", amount);
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f\n", this.balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Jane Doe", "ACC12345", 1000.00);
        account1.displayBalance();
        account1.deposit(500.00);
        account1.displayBalance();
        account1.withdraw(200.00);
        account1.displayBalance();
        account1.withdraw(2000.00);
    }
}