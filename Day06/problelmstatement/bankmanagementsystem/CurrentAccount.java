package problelmstatement.bankmanagementsystem;

// CurrentAccount extends BankAccount and implements Loanable
public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit = 5000.0; // Overdraft limit for current accounts

    // Constructor to initialize current account details
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        // No interest for current accounts
        return 0;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Loan eligibility criteria for current accounts
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for: $" + amount);
            return true;
        }
        System.out.println("Loan application denied.");
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; // Eligibility includes overdraft
    }
}
