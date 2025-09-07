package polymorphism.Overriding.Payment;


class PayPal extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("🌐 Paid Rs." + amount + " using PayPal.");
    }
}