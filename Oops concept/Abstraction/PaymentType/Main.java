package Abstraction.PaymentType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Choose payment method (1 - CreditCard, 2 - UPI): ");
        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment = null;

        switch(choice) {
            case 1:
                System.out.print("Enter card number: ");
                String card = sc.nextLine();
                payment = new CreditCardPayment(amount, card);
                break;
            case 2:
                System.out.print("Enter UPI ID: ");
                String upi = sc.nextLine();
                payment = new UPIPayment(amount, upi);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if(payment != null) {
            payment.paymentDetails();
            payment.makePayment();  // dynamic method dispatch
        }

        sc.close();
    }
}