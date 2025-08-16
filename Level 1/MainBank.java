public class MainBank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(98765, "John", 5000, 5.0);
        sa.displayAccount();
        sa.deposit(2000);
        sa.displayAccount();
    }
}

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() +
                           ", Interest Rate: " + interestRate + "%");
    }
}
