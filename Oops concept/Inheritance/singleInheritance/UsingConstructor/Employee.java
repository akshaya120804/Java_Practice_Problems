package Inheritance.singleInheritance.UsingConstructor;

import java.util.Scanner;

class Details{
	protected String name ;
	protected int salary;
	Details(String name , int salary){
		this.name=name;
		this.salary=salary;
	}
}


class Dept extends Details {
	protected String dept;
	Dept(String name ,int salary, String dept){
		super(name,salary);
		this.dept=dept;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Dept : "+dept);
		System.out.println("Salary : "+salary);
	}
}
public class Employee {
	public static void main(String[] args) {
		int salary;
		String name,dept;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter the Employee Dept : ");
		dept = sc.nextLine();
		System.out.println("Enter the salary : ");
		salary = sc.nextInt();
		Dept d= new Dept(name,salary,dept);
		d.display();
		
	}
}
