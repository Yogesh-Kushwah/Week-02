// Class to represent a Bank Account
class BankAccount {

    String accountHolder;  // Name of the account holder
    int accountNumber;      // Account number of the bank account
    int balance;            // Current balance in the bank account

    // Constructor to initialize the bank account details
    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;  // Assign account holder name
        this.accountNumber = accountNumber;  // Assign account number
        this.balance = balance;              // Assign initial balance
    }

    // Method to deposit money into the account
    public int dipostingMoney(int money) {
        balance += money;   // Add money to the balance
        return balance;      // Return the updated balance
    }

    // Method to withdraw money from the account
    public int withDrawingMoney(int drawingMoney) {
        if (balance < drawingMoney) {  // Check if there are sufficient funds
            System.out.println("Insufficient Balance");  // Print insufficient balance message
            return balance;  // Return current balance without change
        }
        balance -= drawingMoney;  // Subtract the withdrawal amount from the balance
        return balance;  // Return the updated balance after withdrawal
    }

    // Method to display the current balance in the account
    public void currentBalance() {
        if (balance < 0) {  // Avoid displaying negative balance
            return;  // Exit the method
        }
        System.out.println("The current Balance in the Account is " + balance);  // Print the balance
    }
}

public class ATMSimulate {
    public static void main(String[] args) {
        // Create a BankAccount object with sample data
        BankAccount bankAccount = new BankAccount("Yogesh", 12345, 500);

        // Deposit money into the account
        bankAccount.dipostingMoney(500);

        // Withdraw money from the account
        bankAccount.withDrawingMoney(100);

        // Display the current balance
        bankAccount.currentBalance();
    }
}
