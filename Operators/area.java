package javaproject;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Area :"+(a*b));
		System.out.println("Perimeter :"+2*(a+b));
}
}
