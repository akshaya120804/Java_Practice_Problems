package javaproject;

import java.util.Scanner;

public class arrcounteven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0 , odd=0;
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			if(arr[i]%2==0) even ++;
			else  odd++;
		}
		System.out.println("Even :"+even);
		System.out.println("Odd :"+odd);

	}
}
