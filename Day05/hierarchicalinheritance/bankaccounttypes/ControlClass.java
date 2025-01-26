package hierarchicalinheritance.bankaccounttypes;

public class ControlClass {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(12345, 500, 11);
        savingAccount.displayAccountType();

        CheckingAccount checkingAccount = new CheckingAccount(234, 600, 200);
        checkingAccount.displayAccountType();

        FixedDeposit fixedDeposit = new FixedDeposit(4567, 1000, 100000);
         fixedDeposit.displayAccountType();

    }
}
