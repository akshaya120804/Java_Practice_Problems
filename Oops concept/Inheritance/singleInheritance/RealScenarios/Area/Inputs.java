package Inheritance.singleInheritance.RealScenarios.Area;

import java.util.Scanner;

public class Inputs {
	Scanner sc = new Scanner(System.in);
	void square() {
		System.out.println("Let's calculate the Area of Square !");
		System.out.println("Enter the side of Square : ");
		float a = sc.nextFloat();
		System.out.println("The Area of the Square is "+a*a);
	}
	void rectangle() {
		System.out.println("Let's calculate the Area of Rectangle !");
		System.out.println("Enter the Length of Rectangle : ");
		float a = sc.nextFloat();
		System.out.println("Enter the Breath of Rectangle : ");
		float b = sc.nextFloat();
		System.out.println("The Area of the Rectangle is "+a*b);
	}
	void triangle() {
		System.out.println("Let's calculate the Area of Triangle !");
		System.out.println("Enter the Base of Triangle : ");
		float a = sc.nextFloat();
		System.out.println("Enter the Heigth of Triangle : ");
		float b = sc.nextFloat();
		System.out.println("The Area of the Triangle is "+(a*b)/2);
	}
	void circle() {
		System.out.println("Let's calculate the Area of Circle !");
		System.out.println("Enter the radius of Circle : ");
		float a = sc.nextFloat();
		System.out.println("The Area of the Circle is "+ 3.14*a);
	}
	
}
