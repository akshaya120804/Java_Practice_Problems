package javaproject;

import java.util.Scanner;

public class WHILEGCD {
	public static void main(String[] args ) {
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		while(n2!=0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		System.out.println(n1);
	}
}
