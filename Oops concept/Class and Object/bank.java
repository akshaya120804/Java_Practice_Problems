package array;

import java.util.Scanner;

class detail {
	String name ;
	int acc ;
	double bal,def,sum;
	detail(String name ,int acc ,double bal){
		this.name = name ;
		this.acc = acc ;
		this.bal = bal ;

	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Account number :"+acc);
		System.out.println("Balance :"+bal);

	}
	public double deposit(double dep) {
		 sum = bal+dep;
		 System.out.println("Amount after deposit:"+sum);
		 return sum;
	}
	public double withdraw(double wit) {
		 def = sum-wit;
		 System.out.println("Amount after withdraw:"+def);
		 return def;
	}
}
public class bank{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int acc = sc.nextInt();
		double bal = sc.nextDouble();
		double dep = sc.nextDouble();
		double wit = sc.nextDouble();
		detail obj = new detail(name,acc,bal);
		obj.display();
		obj.deposit(dep);
		obj.withdraw(wit);
	}
}

