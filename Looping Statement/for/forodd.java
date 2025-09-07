package javaproject;

import java.util.Scanner;

public class forodd {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Odd Ascending");
		for(int i =1 ; i<=n;i=i+2) {
			System.out.print(i+" ");

		}
		System.out.println(" ");
		System.out.println("Even Ascending");
		for(int i =0; i<n;i=i+2) {
			System.out.print(i+" ");

		}

	}
}
