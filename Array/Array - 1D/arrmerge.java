package javaproject;

import java.util.Scanner;

public class arrmerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int [m];
		for(int i = 0;i<m;i++) {
			arr[i]=sc.nextInt();
		}
		int [] arr1 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int [] merge = new int[m+n];
		for(int i = 0;i<m;i++) {
			merge[i]=arr[i];
		}
		for(int i = 0;i<n;i++) {
			merge[i+m]=arr1[i];
		}
		for(int i = 0;i<n+m;i++) {
			System.out.print(merge[i]+" ");
		}
	}
}
