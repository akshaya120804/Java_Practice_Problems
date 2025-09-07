package javaproject;

import java.util.Scanner;

public class srtringcontains {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = s1+s1;
		if(s3.contains(s2)) {
			System.out.println("S2 is present ");
		}
		else {
			System.out.println("S2 is not present ");

		}
	}
}
