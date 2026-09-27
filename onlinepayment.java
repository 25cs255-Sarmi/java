class Payment {

    // Method Overloading - Compile-time Polymorphism

    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs." + amount);
    }

    void makePayment(double amount, String mode) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Mode: " + mode);
    }

    void makePayment(double amount, String mode, String transactionId) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Mode: " + mode);
        System.out.println("Transaction ID: " + transactionId);
    }
}


// Subclass
class UPIPayment extends Payment {

    // Method Overriding - Runtime Polymorphism
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment");
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment successful using UPI.");
    }
}


// Main Class
public class onlinepayment {
    public static void main(String[] args) {

        // Create object of subclass
        UPIPayment upi = new UPIPayment();

        System.out.println("----- Compile-Time Polymorphism -----");

        // Calling overloaded methods
        upi.makePayment(1000);
        upi.makePayment(1500, "UPI");
        upi.makePayment(2000, "UPI", "TXN12345");

        System.out.println();

        System.out.println("----- Runtime Polymorphism -----");

        // Parent reference pointing to child object
        Payment payment = new UPIPayment();

        // Calls overridden method
        payment.makePayment(2500);

        System.out.println();
        System.out.println("Payment Details displayed successfully.");
    }
}
