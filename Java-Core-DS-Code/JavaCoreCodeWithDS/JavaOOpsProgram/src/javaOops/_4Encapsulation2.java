package javaOops;
class BankAccount {
    private double balance;  // Private field

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

// Main Class
public class _4Encapsulation2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);  // Initial deposit

        account.deposit(200);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(150);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1000);  // Attempting invalid withdrawal
    }
}
