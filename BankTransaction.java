import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance!"
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: Rs. " + balance);
    }
}

public class BankTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Current Balance: Rs. " + account.balance);
        }
        finally{
            System.out.println("Transaction Completed");

        }
        sc.close();
    }
}