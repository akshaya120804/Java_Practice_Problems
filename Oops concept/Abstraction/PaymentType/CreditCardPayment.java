package Abstraction.PaymentType;

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment with Card No: " + cardNumber);
        System.out.println("₹" + amount + " paid successfully via Credit Card.");
    }
}