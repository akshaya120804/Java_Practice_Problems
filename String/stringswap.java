package javaproject;

import java.util.Scanner;

public class stringswap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int n = st.length()-1;
		char [] st1 = st.toCharArray();

		for(int i = 0;i<n/2;i+=2) {
			char temp = st1[i];
			st1[i]=st1[n-i];
			st1[n-i]=temp;
			
		}
		System.out.println(st1);
	}
}
