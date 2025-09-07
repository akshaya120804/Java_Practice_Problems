package javaproject;

import java.util.Scanner;

public class arr2diagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int primary =0 ;
		int sec = 0;
		int [][] arr = new int [m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i = 0;i<m;i++) {
			primary+=arr[i][i];
			sec+=arr[i][m-i-1];
		}
		System.out.println("Primary : "+primary);
		System.out.println("Secondary : "+sec);

	}
}
		
