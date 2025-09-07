package polymorphism.Overloading.Calculator;

public class Main {
	 public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        System.out.println("Sum of two integers: " + calc.add(5, 10));
	        System.out.println("Sum of two doubles: " + calc.add(3.5, 4.8));
	        System.out.println("Sum of three integers: " + calc.add(2, 4, 6));
	    }
}
