package Inheritance.HierarchicalInheritance.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fruit Name: ");
        String fruitName = sc.nextLine();
        System.out.println("Enter Fruit Calories: ");
        int fruitCalories = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Vitamin (A, B, C, etc.): ");
        String vitamin = sc.nextLine();

        Fruit fruit = new Fruit(fruitName, fruitCalories, vitamin);

        System.out.println("\nEnter Fast Food Name: ");
        String fastName = sc.nextLine();
        System.out.println("Enter Fast Food Calories: ");
        int fastCalories = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Oil Level (High/Medium/Low): ");
        String oilLevel = sc.nextLine();

        FastFood fastFood = new FastFood(fastName, fastCalories, oilLevel);

        System.out.println("\n--- Fruit Details ---");
        fruit.showDetails();

        System.out.println("\n--- Fast Food Details ---");
        fastFood.showDetails();
    }
}