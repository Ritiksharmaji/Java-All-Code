package exceptionHandle.tryCatch;

import java.sql.*;
class BankException extends Exception {
    public BankException(String message, Throwable cause) {
        super(message, cause); // Chaining the cause
    }
}

class Bank {
    public void withdraw(double amount) throws BankException {
        try {
            connectToDatabase(); // Simulating database failure
        } catch (SQLException e) {
            // Wrapping SQLException inside a custom BankException
            throw new BankException("Withdrawal failed due to a database issue.", e);
        }
    }

    public void connectToDatabase() throws SQLException {
        throw new SQLException("Database connection lost!"); // Simulating an error
    }
}

public class TryCatch_Class7_RealExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.withdraw(1000);
        } catch (BankException e) {
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Root Cause: " + e.getCause());
        }
    }
}
