package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public  void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public  void deposit(double amaount){
        if (amaount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;//exits the method
        }
        balance += amaount;
    }

    public void withdraw(double amount){//withdraw - para cekme
        if (amount>balance){
            System.out.println("Insufficient balance.");//yetersiz bakiye
            return;//exits the method
        }
        if (amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero.");
            return;//exits the method
        }
        balance -= amount;
    }

/*
    BankAccount task:
       Attributes:
         1. accountHolder, 2. accountNumber, 3. balance
       Actions:
       1. setInfo(): sets the accountHolder and accountNumber attributes
       2. toString()
       3. checkBalance(): displays the available balance
       4. deposit(): increases the balance by the given amount
       5. withdraw(): decreases the balance by the given amount
     */
}
