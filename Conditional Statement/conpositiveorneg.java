package javaproject;

import java.util.Scanner;

public class conpositiveorneg {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("A is a positive number.");
		}
		else {
			System.out.println("A is negative number.");
		}
	}
}
