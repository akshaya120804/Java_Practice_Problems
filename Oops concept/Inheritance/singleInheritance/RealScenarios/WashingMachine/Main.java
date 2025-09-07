package Inheritance.singleInheritance.RealScenarios.WashingMachine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Speed : ");
		float speed = sc.nextFloat();
		
		System.out.println("Enter the Power : ");
		float power = sc.nextFloat();
		
		Inputs n = new Inputs(speed,power);
		String r = "Yes";
		String r1="Yes";
		sc.nextLine();
		n.disp();

		while(r.equalsIgnoreCase(r1)) {
			n.choice();
			n.operation();
			System.out.println("\nDo you want to add other operation (Yes/No) : ");
			r1=sc.nextLine();
		}
		System.out.println("\nHappy Cleaning.....! ");
	}
	
}
