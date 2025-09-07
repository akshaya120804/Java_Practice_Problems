package Inheritance.singleInheritance.RealScenarios.WashingMachine;

import java.util.Scanner;

public class Inputs extends TypeOfWash{
	private float speed;
	private float power;
	Scanner sc = new Scanner (System.in);

	Inputs(float speed ,float power  ){
		this.speed=speed;
		this.power=power;
	}
	void disp() {
		System.out.println("The machine is running at the Speed "+speed);
		System.out.println("The machine is given "+power+" W");
	}
	void choice() {
		System.out.println("\nEnter the Option to proceed.....\n1.Normal Wash \n2.Quick Wash \n3.Heavy Wash \n4.Dry Wash \n5.Eco Wash");
	}
	void operation() {
		int a = sc.nextInt();
		sc.nextLine();
		switch(a) {
			case 1 :
				normalWash();
				break;
			case 2 :
				quickWash();
				break;
			case 3 :
				heavyWash();
				break;
			case 4 :
				dryWash();
				break;
			case 5 :
				ecoWash();
				break;
			default:
				System.out.println("Invalid Input !");
				
		}
	}
}
