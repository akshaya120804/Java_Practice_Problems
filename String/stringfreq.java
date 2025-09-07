package javaproject;

import java.util.Scanner;

public class stringfreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int [] freq = new int [256];
		for(int i =0;i<st.length();i++) {
			char ch = st.charAt(i);
			freq[ch]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println((char)i+" : "+freq[i]);
			}
		}
	}
}
