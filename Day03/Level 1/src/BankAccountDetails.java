class BankAccount{

    static String bankName;
    String accountHolder;
    final int accountNumber;

    static int noOfAccount=0;

    public BankAccount(String accountHolder, int accountNumber,String bankName) {
        noOfAccount++;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        BankAccount.bankName =  bankName;
    }

    static void getTotalAccount(){

        System.out.println("The Total Account in the bank is "+  noOfAccount);
    }

    void display(){

        System.out.println("BankName "+ bankName+" AccountHolderName "+ accountHolder+" AccountNumber "+accountNumber);
    }
}






public class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount("Adarsh", 12345,"PNB");

        if(bank instanceof BankAccount){
            bank.display();
        }


        BankAccount bank1=new BankAccount("Survesh", 13345,"PNB");

        if(bank instanceof BankAccount){
            bank.display();
        }
        BankAccount.getTotalAccount();
    }
}
