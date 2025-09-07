package sample;

import java.util.Scanner;

public class gcd7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n=a;
		if(a>b) {
			n=b;
		}

		for(int i=a;i>0;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
}
