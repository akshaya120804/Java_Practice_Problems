package sample;

import java.util.Arrays;
import java.util.Scanner;

public class prime_till_n_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();

		for (int i=2;i<=a;i++) {
			boolean prime =true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				System.out.print(i+" ");

			}
		}
		
	}
}
