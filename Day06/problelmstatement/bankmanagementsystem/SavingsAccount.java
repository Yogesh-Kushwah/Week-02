package problelmstatement.bankmanagementsystem;



// SavingsAccount extends BankAccount and implements Loanable
public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% interest rate

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Loan eligibility criteria for savings accounts
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for: $" + amount);
            return true;
        }
        System.out.println("Loan application denied.");
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }
}
