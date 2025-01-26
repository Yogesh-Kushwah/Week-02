package problelmstatement.bankmanagementsystem;



import java.util.ArrayList;
import java.util.List;

// Main class to test the banking system
public class BankController {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add savings and current accounts to the list
        accounts.add(new SavingsAccount("SA123", "Alice", 5000.0));
        accounts.add(new CurrentAccount("CA456", "Bob", 3000.0));

        // Process accounts and calculate interest
        BankingSystem.processAccounts(accounts);

        // Apply for a loan (example)
        System.out.println("Applying for a loan:");
        ((Loanable) accounts.get(0)).applyForLoan(8000.0); // Alice applying for a loan
    }
}
