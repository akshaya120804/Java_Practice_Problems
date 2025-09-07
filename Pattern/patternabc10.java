package javaproject;

import java.util.Scanner;

public class patternabc10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		char ch = sc.next().charAt(0);
		char ch1 = ch;
		for(int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			ch = ch1;
			System.out.println();
		}
	}
}
