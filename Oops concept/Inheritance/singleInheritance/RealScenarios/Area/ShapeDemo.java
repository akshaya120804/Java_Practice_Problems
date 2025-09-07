package Inheritance.singleInheritance.RealScenarios.Area;

import java.util.Scanner;

class Choice{
	void disp() {
		System.out.println("\nEnter the choice......\n1.Square\n2.Rectangle\n3.Triangle\n4.Circle");
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Let's claculate the area !");
		Choice c = new Choice();
		Area i = new Area();
		String l = "Yes";
		String l1 = "Yes";
		while(l.equalsIgnoreCase(l1)) {
			c.disp();
			i.operation();
			System.out.println("Do you want to Continue (yes/no) : ");
			l1 = sc.nextLine();
		}
		System.out.println("Thank you for using our Application !");
	}
}
