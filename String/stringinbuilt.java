package javaproject;

import java.util.Scanner;

public class stringinbuilt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int index = sc.nextInt();
		char ch = sc.next().charAt(0);
		String s = st.substring(0,index)+ch +st.substring(index++);
		System.out.println(s);	
	}
}
