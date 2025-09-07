package zoho;

import java.util.Scanner;

public class sortwithoutsort {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp =0;
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("After sort :");
		for(int e :arr) {
			System.out.print(e+" ");
		}
	}
}
