package problelmstatement.bankmanagementsystem;

import java.util.List;

// Utility class to process bank accounts
public class BankingSystem {
    // Method to process accounts and calculate interest dynamically
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: $" + account.getBalance());

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);

            // Check if the account is loanable
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                System.out.println("Loan Eligibility: $" + loanableAccount.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}
