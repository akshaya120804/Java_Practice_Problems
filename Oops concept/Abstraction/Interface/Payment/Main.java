package Abstraction.Interface.Payment;

public class Main {
    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();

        app.addMoney(500);
        app.pay(200);
        app.getPaymentDetails();
        app.pay(400);
    }
}