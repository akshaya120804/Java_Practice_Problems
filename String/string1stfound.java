package javaproject;

import java.util.Scanner;

public class string1stfound {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		String st = sc.next();
		String st1 = sc.next();
		int index = -1;
		for(int i =0 ;i<=st.length()-st1.length();i++) {
			boolean flag = true ; 
			for(int j = 0;j<st1.length();j++) {
				if(st.charAt(i+j)!=st1.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(i);
				break;
			}
		}
	}
}
