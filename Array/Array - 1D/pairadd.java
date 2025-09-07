package sample;

import java.util.Arrays;
import java.util.Scanner;

public class pairadd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int [] arr=new int[n];
		int j=1;
		for (int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i==(n-1)) {
				break;
			}
			else {
				j=i+1;

			}
			arr[i]=arr[i]+arr[j];
		}
		System.out.println(Arrays.toString(arr));
	}
}
