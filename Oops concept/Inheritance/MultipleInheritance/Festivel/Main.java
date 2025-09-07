package Inheritance.MultipleInheritance.Festivel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name , location,food,thing;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Festivel : ");
		name = sc.nextLine();
		
		System.out.println("Enter the Location where the festivel is famous : ");
		location = sc.nextLine();
		
		System.out.println("Enter the Festivel's Food : ");
		food = sc.nextLine();
		
		System.out.println("Enter the Festivel's Thing : ");
		thing = sc.nextLine();
		
		Thing t = new Thing(name,location,food,thing);
		System.out.println(t.toString());
	}
}
