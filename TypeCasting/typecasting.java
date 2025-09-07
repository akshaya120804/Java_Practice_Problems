package javaproject;

import java.util.Scanner;

public class typecasting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		short a = sc.nextShort();
		float b = a;
		double c = sc.nextDouble();
		int d = (int)c;
		
		System.out.println("Ascending (implicit / widening ):"+b);
		System.out.println("Descending (explicit / narrowing ):"+d);
}

}
