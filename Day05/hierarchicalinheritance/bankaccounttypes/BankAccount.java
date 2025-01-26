package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {

    int accountNumber;
    int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType(){
        System.out.println("Account number "+accountNumber+" Account Balance "+balance);
    }
}
