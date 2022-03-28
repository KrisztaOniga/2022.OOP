package oop.labor06.lab6_1;

public class BankAccount {

    private double balance;
    private final String accountNumber;

    //Constructor

    //generaljunk egyedi szamlaszamot
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;

    public BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    public String createAccountNumber(){
        int zeros = ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length();
        return PREFIX + "0".repeat(zeros) + numAccounts;
        //StringBuffer account = new StringBuffer();
        //account.append(PREFIX + zeros + numAccounts);
    }

    //getters
    public double getBalance(){
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }

    public boolean withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String Account = this.accountNumber;
        Account += " account number, your balance is: ";
        Account += this.balance + " ";
        Account += " EUR ";
        return Account;
    }
}
