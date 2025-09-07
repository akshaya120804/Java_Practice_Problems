package Abstraction.Interface.RidingService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Ride Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Auto");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Pickup Location: ");
        String pickup = sc.nextLine();

        System.out.print("Enter Drop Location: ");
        String drop = sc.nextLine();

        Ride ride;

        switch(choice) {
            case 1: ride = new CarRide(); break;
            case 2: ride = new BikeRide(); break;
            case 3: ride = new AutoRide(); break;
            default: System.out.println("Invalid choice!"); return;
        }

        // Abstraction in action
        ride.bookRide(pickup, drop);

        sc.close();
    }
}