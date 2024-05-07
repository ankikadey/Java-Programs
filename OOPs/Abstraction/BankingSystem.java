package Abstraction;
/*Banking System:
Create a banking system where you have different types of accounts such as SavingsAccount, CheckingAccount, and LoanAccount.
Each account type should have specific attributes and methods like deposit, withdraw, etc.
Use inheritance to model the relationship between different account types. */

abstract class Account{
    String accNumber;
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public String getAccNumber(){
        return accNumber;
    }
    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends Account{
    SavingsAccount(String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){
        if(balance <= amount){
            System.out.println("Insufficient Funds");
        }
        else{
            balance -= amount;
        }
    }
}
class CheckingAccount extends Account{
    CheckingAccount(String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){
        if(balance <= amount){
            System.out.println("Insufficient Funds");
        }
        else{
            balance -= amount;
        }
    }
}
class LoanAccount extends Account{
    LoanAccount(String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        System.out.println("You can't deposit in a loan account");
    }

    @Override
    public void withdraw(double amount){
        System.out.println("You can't withdraw from a loan account");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account acc1;
        acc1 = new SavingsAccount("54351697976841654684", 100000);
        System.out.println(acc1.getBalance());
        acc1.deposit(500);
        System.out.println(acc1.getBalance());
        acc1.withdraw(50000);
        System.out.println(acc1.getBalance());
        acc1.withdraw(100000);
        System.out.println(acc1.getBalance());

        acc1 = new LoanAccount("gvd65464", 500000);
        acc1.deposit(500);
    }
}
