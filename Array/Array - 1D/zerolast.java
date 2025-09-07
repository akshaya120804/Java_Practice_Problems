package zoho;

import java.util.Scanner;

public class zerolast {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int cur = 0;
		for(int i =0;i<n;i++) {
			if(arr[i]!=0) {
				arr[cur]=arr[i];
				cur ++;
			}
		}
		while(cur<n) {
			arr[cur]=0;
			cur++;
		}
		 
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
