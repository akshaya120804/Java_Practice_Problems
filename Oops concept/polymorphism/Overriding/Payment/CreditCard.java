package polymorphism.Overriding.Payment;

class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid Rs." + amount + " using Credit Card.");
    }
}