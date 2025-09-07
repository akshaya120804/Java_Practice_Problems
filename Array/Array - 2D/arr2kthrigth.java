package javaproject;

import java.util.Scanner;

public class arr2kthrigth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		k = k%n;
		for(int i = 0;i<k;i++) {
			int first = arr[n-1];
			for(int j = n-1 ;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=first;
		}
		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
