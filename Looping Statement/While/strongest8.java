package sample;

import java.util.Scanner;

public class strongest8 {
	    public static int factorial(int n) {
	        if(n==0||n==1) return 1;
	        return n*factorial(n-1);
	    }

	    public static boolean isStrong(int num) {
	        int originalNum = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10; 
	            sum += factorial(digit); 
	            num /= 10; 
	        }

	        return sum == originalNum; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        scanner.close(); // Closing scanner to avoid memory leaks

	        // Checking if it's a Strong Number
	        if (isStrong(num)) {
	            System.out.println(num + " is a Strong Number.");
	        } else {
	            System.out.println(num + " is NOT a Strong Number.");
	        }
	    }
	}
