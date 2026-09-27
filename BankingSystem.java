class Account {
    String name;
    int accountNumber;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayAccount() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}


// Savings Account
class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    void displaySavingsAccount() {
        super.displayAccount();
        System.out.println("Savings Account Balance: " + balance);
    }
}


// Current Account
class CurrentAccount extends Account {
    double balance;

    CurrentAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    void displayCurrentAccount() {
        super.displayAccount();
        System.out.println("Current Account Balance: " + balance);
    }
}


// Premium Savings Account
class PremiumSavingsAccount extends SavingsAccount {
    double interestRate;

    PremiumSavingsAccount(String name, int accountNumber,
                          double balance, double interestRate) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayPremiumSavingsAccount() {
        super.displaySavingsAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


// Main class
public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount s =
            new SavingsAccount("Sami", 101, 25000);

        CurrentAccount c =
            new CurrentAccount("Priya", 102, 40000);

        PremiumSavingsAccount p =
            new PremiumSavingsAccount("Ravi", 103, 50000, 7.5);

        System.out.println("----- SAVINGS ACCOUNT -----");
        s.displaySavingsAccount();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        c.displayCurrentAccount();

        System.out.println("\n----- PREMIUM SAVINGS ACCOUNT -----");
        p.displayPremiumSavingsAccount();
    }
}