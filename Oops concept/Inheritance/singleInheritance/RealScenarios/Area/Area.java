package Inheritance.singleInheritance.RealScenarios.Area;

import java.util.Scanner;

public class Area extends Inputs {
	Scanner sc = new Scanner(System.in);
	void operation() {
		int a = sc.nextInt();
		switch(a) {
			case 1 :
				square();
				break;
			case 2 :
				rectangle();
				break;
			case 3 :
				triangle();
				break;
			case 4 :
				circle();
				break;
			default :
				System.out.println("Invalid Input !");
		}
	}
	
}
