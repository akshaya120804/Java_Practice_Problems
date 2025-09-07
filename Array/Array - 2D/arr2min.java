package javaproject;

import java.util.Scanner;

public class arr2min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum =0;
		int [][] arr = new int [m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max = arr[0][0];
		int min = arr[0][0];

		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);

	}
}
