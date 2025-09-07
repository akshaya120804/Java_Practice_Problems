package Abstraction.Interface.Payment;

interface UPIPayments {
    void pay(double amount);
}

interface WalletPayments {
    void addMoney(double amount);
}

// Multiple inheritance with interfaces
interface OnlinePayments extends UPIPayments, WalletPayments {
    void getPaymentDetails();
}