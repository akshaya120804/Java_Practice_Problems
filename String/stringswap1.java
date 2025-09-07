package javaproject;

import java.util.Scanner;

public class stringswap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int n = st.length()-1;
		char [] st1 = st.toCharArray();

		for(int i = 0;i<n-1;i+=2) {
			char temp = st1[i];
			st1[i]=st1[i+1];
			st1[i+1]=temp;
			
		}
		System.out.println(st1);
	}

}
