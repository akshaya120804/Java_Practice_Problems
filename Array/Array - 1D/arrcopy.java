package javaproject;

import java.util.Scanner;

public class arrcopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int [] arr1 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[i]=arr[i];
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
