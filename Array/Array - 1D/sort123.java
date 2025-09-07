package zoho;

import java.util.Scanner;

public class sort123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int zero = 0;
		int one  =0 , two = 0;
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0  ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int ele : arr) {
			if(ele == 0) zero ++;
			else if (ele == 1) one ++;
			else two ++;
		}
		for(int i = 0;i<n;i++) {
			if(zero>0) {
				arr[i]=0;
				zero--;
			}
			else if(one>0) {
				arr[i]=1;
				one--;
			}
			else {
				arr[i]=2;
				two--;
			}
		}
		for(int i = 0 ;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
