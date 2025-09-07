package polymorphism.Overriding.Payment;

class UPI extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("📱 Paid Rs." + amount + " using UPI.");
    }
}