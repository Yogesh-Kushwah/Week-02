package hierarchicalinheritance.bankaccounttypes;

import hierarchicalinheritance.bankaccounttypes.BankAccount;

public class SavingAccount extends BankAccount {

     int interestRate;

    public SavingAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType(){
          super.displayAccountType();
        System.out.println(" Interest rate "+interestRate+" % ");
    }
}
