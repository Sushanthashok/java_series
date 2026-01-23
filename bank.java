package Suskkoo;

class BankAccount {
    String name;
    int accountNo;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.name = "Sushanth";
        b1.accountNo = 101;
        b1.balance = 5000;

        b1.displayBalance();
        b1.deposit(2000);
        b1.displayBalance();
        b1.withdraw(3000);
        b1.displayBalance();
    }
}
