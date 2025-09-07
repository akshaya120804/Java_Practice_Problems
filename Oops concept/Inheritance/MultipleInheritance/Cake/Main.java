package Inheritance.MultipleInheritance.Cake;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		String recipeName;
		String ingredients;
		String sweetLevel;
		String flavor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Recipe Name : ");
		recipeName = sc.nextLine();
		System.out.println("Enter the Ingredients : ");
		ingredients = sc.nextLine();
		System.out.println("Enter the Sweet Level : ");
		sweetLevel = sc.nextLine();
		System.out.println("Enter the Health Features : ");
		flavor = sc.nextLine();
		Cake c = new Cake(recipeName,ingredients,sweetLevel,flavor);
        c.displayCake();
	}
}
