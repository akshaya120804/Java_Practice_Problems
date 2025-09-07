package Inheritance.singleInheritance.RealScenarios.Bank;

import java.util.Scanner;

public class Details extends Account {
	Scanner sc = new Scanner(System.in);

	Details(String name, int number, float amount) {
		super(name, number, amount);
	}
	void operation() {
		int a =sc.nextInt();
		switch(a) {
		case 1:
			display();
			break;
		case 2:
			System.out.println("Enter the amount to withdraw : ");
			float withd = sc.nextFloat();
			withdraw(withd);
			break;
		case 3:
			System.out.println("Enter the amount to deposit : ");
			float dep = sc.nextFloat();
			deposit(dep);
			break;
		default:
			System.out.println("Invalid Input !");
		}
	}
}

