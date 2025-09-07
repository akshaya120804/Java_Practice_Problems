package javaproject;

import java.util.Scanner;

public class stringeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		for(int i =0 ;i<st.length();i+=2) {
			System.out.println(st.charAt(i));
		}
	}
}
