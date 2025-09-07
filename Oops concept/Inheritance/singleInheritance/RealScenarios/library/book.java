package Inheritance.singleInheritance.RealScenarios.library;

import java.util.Scanner;

public class book {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the book name : ");
		String name = sc.nextLine();
		System.out.println("Enter the book id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book author name : ");
		String author = sc.nextLine();
		System.out.println("Enter the cost : ");
		float cost = sc.nextFloat();
		System.out.println("Enter the version : ");
		int version=sc.nextInt();
		About d = new About(name , id,author,cost,version);
		System.out.println(d.toString());
	}
}
