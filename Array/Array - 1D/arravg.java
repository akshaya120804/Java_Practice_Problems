package javaproject;

import java.util.Scanner;

public class arravg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ;
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum :"+sum);
		double avg = sum/n;
		System.out.println("Average :"+avg);

	}
}
