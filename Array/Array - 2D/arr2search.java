package javaproject;

import java.util.Scanner;

public class arr2search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int target = sc.nextInt();
		int [][] arr = new int [m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		boolean flag = false;
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(target == arr[i][j]) {
					System.out.println("("+i+","+j+")");
					flag = true ;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
