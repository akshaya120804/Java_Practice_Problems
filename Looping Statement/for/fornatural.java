package javaproject;

import java.util.Scanner;

public class fornatural {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i =0 ; i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i =n ; i>0;i--) {
			System.out.print(i+" ");
		}

		
	}
}
