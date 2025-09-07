package javaproject;

import java.util.Scanner;

public class stringvowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int vowel =0;
		int consonant = 0;
		st=st.toLowerCase();
		for(int i =0 ;i<st.length();i++) {
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='o'||st.charAt(i)=='u'){
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonant);


	}
}
