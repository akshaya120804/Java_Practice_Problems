package javaproject;

import java.util.Scanner;

public class arr2count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count =0;
		int [][] arr = new int [m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}
