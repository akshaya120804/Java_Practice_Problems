package javaproject;

import java.util.Scanner;

public class con3dig {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>99 && a<1000) {
			System.out.println("A is 3 digit number.");
		}
		else {
			System.out.println("A is not 3 digit number.");
		}
	}
}
