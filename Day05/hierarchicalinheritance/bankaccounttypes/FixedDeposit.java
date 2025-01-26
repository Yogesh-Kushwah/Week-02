package hierarchicalinheritance.bankaccounttypes;

import hierarchicalinheritance.bankaccounttypes.BankAccount;

public class FixedDeposit extends BankAccount {

    int fixedDeposit;

    public FixedDeposit(int accountNumber, int balance, int fixedDeposit) {
        super(accountNumber, balance);
        this.fixedDeposit = fixedDeposit;
    }

   void displayAccountType(){

        super.displayAccountType();
       System.out.println("Fixed Deposit "+fixedDeposit);
   }
}
