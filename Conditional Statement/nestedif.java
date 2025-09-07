package javaproject;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter heigth :");
		int heigth = sc.nextInt();
		if(age>=18) {
			if(heigth>=160) {
				System.out.println("Age and Height is enough");
			}
			else {
				System.out.println("Height is not enough");
			}
		}
		else {
			System.out.println("Age is not enough");
		}
	}
}
