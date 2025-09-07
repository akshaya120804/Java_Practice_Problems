package Inheritance.HierarchicalInheritance.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type:\n1. Car\n2. Bike\n3. Truck");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {
            case 1:
                System.out.println("Enter brand: ");
                String cBrand = sc.nextLine();
                System.out.println("Enter speed: ");
                int cSpeed = sc.nextInt();
                System.out.println("Enter number of doors: ");
                int doors = sc.nextInt();
                Car car = new Car(cBrand, cSpeed, doors);
                car.showCarDetails();
                break;

            case 2:
                System.out.println("Enter brand: ");
                String bBrand = sc.nextLine();
                System.out.println("Enter speed: ");
                int bSpeed = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter bike type (Sports/Normal): ");
                String type = sc.nextLine();
                Bike bike = new Bike(bBrand, bSpeed, type);
                bike.showBikeDetails();
                break;

            case 3:
                System.out.println("Enter brand: ");
                String tBrand = sc.nextLine();
                System.out.println("Enter speed: ");
                int tSpeed = sc.nextInt();
                System.out.println("Enter load capacity in tons: ");
                int capacity = sc.nextInt();
                Truck truck = new Truck(tBrand, tSpeed, capacity);
                truck.showTruckDetails();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
