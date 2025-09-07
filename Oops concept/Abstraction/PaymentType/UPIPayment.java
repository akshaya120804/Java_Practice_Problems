package Abstraction.PaymentType;

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void makePayment() {
        System.out.println("Processing UPI payment with UPI ID: " + upiId);
        System.out.println("₹" + amount + " paid successfully via UPI.");
    }
}