package zoho;

import java.util.Scanner;

public class leetmin {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int mincount = n+1;
		int minum = arr[0];
		for(int i = 0 ;i<n;i++ ) {
			int count =0;
			boolean flag = false;
			for(int k =0 ;k<i;k++) {
				if(arr[i]==arr[k]) {
					flag = true;
					break;
				}
			}
			if(flag) continue;
			for(int j =0 ;j<n;j++) {
				if(arr[i]==arr[j]) {
					count ++;
				}
			}
			if(count<mincount) {
				mincount = count ;
				minum = arr[i];
			}
			

		}
		System.out.println(minum);
	}
}
