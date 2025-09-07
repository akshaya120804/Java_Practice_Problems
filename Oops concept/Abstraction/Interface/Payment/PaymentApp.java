package Abstraction.Interface.Payment;

class PaymentApp implements OnlinePayments {
    private double walletBalance = 0;

    @Override
    public void pay(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            System.out.println("Paid Rs." + amount + " successfully via UPI. Remaining balance: " + walletBalance);
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }

    @Override
    public void addMoney(double amount) {
        walletBalance += amount;
        System.out.println("Added Rs." + amount + " to wallet. Current balance: " + walletBalance);
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Wallet Balance: " + walletBalance);
    }
}