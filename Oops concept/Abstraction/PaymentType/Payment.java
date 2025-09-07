package Abstraction.PaymentType;

abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method (must be implemented by child classes)
    abstract void makePayment();

    // Concrete method
    public void paymentDetails() {
        System.out.println("Payment initiated for amount: ₹" + amount);
    }
}
