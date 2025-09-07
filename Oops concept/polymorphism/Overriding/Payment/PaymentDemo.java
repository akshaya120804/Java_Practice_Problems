package polymorphism.Overriding.Payment;

import java.util.Scanner;


public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to pay: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Choose payment method (creditcard/paypal/upi): ");
        String method = sc.nextLine().toLowerCase();

        Payment payment;

        switch (method) {
            case "creditcard":
                payment = new CreditCard();
                break;
            case "paypal":
                payment = new PayPal();
                break;
            case "upi":
                payment = new UPI();
                break;
            default:
                payment = new Payment();
                break;
        }

        payment.pay(amount); // runtime polymorphism
        sc.close();
    }
}
