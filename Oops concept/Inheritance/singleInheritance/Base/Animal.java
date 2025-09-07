package Inheritance.singleInheritance.Base;



class Beast{
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Beast{
	void sound() {
		System.out.println("The dog Barks");
	}
}

public class Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sound();
	}
}