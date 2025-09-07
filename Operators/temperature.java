package javaproject;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float cel = sc.nextFloat();
		float fah =  (cel*9/5)+32;
		System.out.println(fah);
		
	}
}
