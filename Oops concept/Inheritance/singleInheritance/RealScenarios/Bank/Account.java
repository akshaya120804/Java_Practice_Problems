package Inheritance.singleInheritance.RealScenarios.Bank;

public class Account {
	private String name;
	private int number;
	private float amount;

	Account(String name , int number , float  amount){
		this.name = name ;
		this.amount=amount;
		this.number=number;
	}
	void display() {
		System.out.println("Account Details.........");
		System.out.println("Name : "+name);
		System.out.println("Account Number : "+number);
		System.out.println("Balance : "+amount);
		System.out.println("--------------------------------------");
	}
	void withdraw(float withd) {
		if(withd>amount) {
			System.out.println("You don't have sufficient amount to withdraw");
		}
		else {
			amount-=withd;
			System.out.println("Amount withdrawed successfully !");
			System.out.println("Withdrawed Amount : "+withd);
			System.out.println("Balance after Withdraw : "+amount);
		}
	}
	void deposit(float dep) {
		amount+=dep;
		System.out.println("Amount deposited successfully !");
		System.out.println("Deposited Amount : "+dep);
		System.out.println("Balance after Withdraw : "+amount);
	}
	
}
