package array;

import java.util.Scanner;

public class majorityelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0,m=0;
		boolean max  = false;
		int [] a = new int [n];
		int [] b = new int [n];
		for(int i = 0 ;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			b[i]=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					b[i] ++;
				}
			}
		}
		for(int i = 0;i<n;i++) {
			if(b[i]>n/2) {
				m=a[i];
				max = true;
				break;
			}
		}
		
		
		if(max) {
			System.out.println(m);
		}
		else {
			System.out.println("-1");

		}
	}
}
