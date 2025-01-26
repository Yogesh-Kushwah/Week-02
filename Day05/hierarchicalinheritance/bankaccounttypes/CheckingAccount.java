package hierarchicalinheritance.bankaccounttypes;

import hierarchicalinheritance.bankaccounttypes.BankAccount;

public class CheckingAccount extends BankAccount {

    int withdrawlLimit;

    public CheckingAccount(int accountNumber, int balance, int withdrawlLimit) {
        super(accountNumber, balance);
        this.withdrawlLimit = withdrawlLimit;
    }

    void displayAccountType(){
        super.displayAccountType();
        System.out.println("Withdrawl limit "+withdrawlLimit);
    }
}
