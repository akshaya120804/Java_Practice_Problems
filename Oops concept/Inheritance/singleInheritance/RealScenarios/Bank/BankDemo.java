package Inheritance.singleInheritance.RealScenarios.Bank;

import java.util.Scanner;

class BankName{
	void display() {
		System.out.println("Welcome to Indian Bank !");
	}
}
class Choice extends BankName{
	void option() {
		System.out.println("\nEnter the Option to proceed.....\n1.Check Balance \n2.Withdraw \n3.Deposit");
	}
	
}
public class BankDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int number;
		float amount;
		String name;
		Choice c = new Choice();
		c.display();
		System.out.println("Enter the Name :");
		name = sc.nextLine();
		System.out.println("Enter the Account Number :");
		number = sc.nextInt();
		System.out.println("Enter the Initial Deposit Amount");
		amount = sc.nextFloat();
		Details e = new Details(name,number,amount);
		System.out.println("\nAccount Created Successfully !");
		e.display();
		String r = "Yes";
		String r1="Yes";
		sc.nextLine();
		while(r.equalsIgnoreCase(r1)) {
			c.option();

			e.operation();
			System.out.println("\nDo you want to continue (Yes/No) : ");
			r1=sc.nextLine();
		}
		System.out.println("\nThank you for choosing our Bank.....! ");
	}
}
