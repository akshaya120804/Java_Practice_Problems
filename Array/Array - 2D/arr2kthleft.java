package javaproject;

import java.util.Scanner;

public class arr2kthleft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		k = k%n;
		for(int i =0;i<k;i++ ) {
			int last = arr[0];
			for(int j = 0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=last;
		}
		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
