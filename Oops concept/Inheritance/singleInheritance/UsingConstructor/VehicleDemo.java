package Inheritance.singleInheritance.UsingConstructor;

import java.util.Scanner;

class Car{
	protected String name , brand;
	protected int amount ;
	Car(String name, String brand , int amount ){
		this.name=name;
		this.brand=brand;
		this.amount=amount;
	
	}
}

class Model extends Car {
	protected String model;

	Model(String name, String brand, int amount,String model) {
		super(name, brand, amount);
		this.model=model;
	}
	@Override
	public String toString() {
		return "Name = " + name + "\nBrand = " + brand + "\nModel = " + model + "\nAmount = "+amount;
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		String name , brand,model;
		int amount ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		System.out.println("Enter the Brand : ");
		brand = sc.nextLine();
		System.out.println("Enter the Model : ");
		model = sc.nextLine();
		System.out.println("Enter the Amount : ");
		amount = sc.nextInt();
		
		Model m = new Model(name , brand , amount,model );
		System.out.println(m.toString());
		
	}
}
