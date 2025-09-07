package polymorphism.Overloading.ShoppingCart;

import java.util.Scanner;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Choose Option: 1.One Item  2.Two Items");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter price of item: ");
                double price = sc.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                System.out.println("Total Bill = ₹" + cart.calculateBill(price, qty));
                break;

            case 2:
                System.out.print("Enter price of first item: ");
                double p1 = sc.nextDouble();
                System.out.print("Enter quantity of first item: ");
                int q1 = sc.nextInt();

                System.out.print("Enter price of second item: ");
                double p2 = sc.nextDouble();
                System.out.print("Enter quantity of second item: ");
                int q2 = sc.nextInt();

                System.out.println("Total Bill = ₹" + cart.calculateBill(p1, q1, p2, q2));
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}