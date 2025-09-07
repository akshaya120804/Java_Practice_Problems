package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class stringanagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String st1 = sc.next();
		if(st.length()!=st.length()) {
			System.out.println("Not anagram");
		}
		else {
			char [] a = st.toCharArray();
			char [] a1 = st.toCharArray();
			Arrays.sort(a);
			Arrays.sort(a1);
			boolean flag = Arrays.equals(a, a1);
			if(flag) {
				System.out.println("anagram");
			}
			else {
				System.out.println("Not anagram");

			}
			
		}
		
	}
}
