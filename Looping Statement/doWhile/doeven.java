package javaproject;

import java.util.Scanner;

public class doeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i = 0;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=n);
		System.out.println("DESCENDING");
		int j = n;
		do {
			System.out.println(j);
			j-=2;
		}while(j>=0);

	}

}
