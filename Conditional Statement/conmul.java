package javaproject;

import java.util.Scanner;

public class conmul {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a%2==0 && a%3==0) {
			System.out.println("A is divisible by 2 and 3.");
		}
		else {
			System.out.println("A is not divisible by 2 and 3.");
		}
	}
}
