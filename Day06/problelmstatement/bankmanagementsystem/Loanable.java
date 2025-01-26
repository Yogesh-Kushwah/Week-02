package problelmstatement.bankmanagementsystem;



// Interface to define loan-related operations
public interface Loanable {
    boolean applyForLoan(double amount);          // Method to apply for a loan
    double calculateLoanEligibility();            // Method to calculate loan eligibility
}
