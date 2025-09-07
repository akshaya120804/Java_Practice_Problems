package array;

import java.util.Scanner;

public class stringreverse {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String r = "";
		char [] a = s.toCharArray();
		int n = s.length();
		for(int i = n-1;i>=0;i--) {
			r+=a[i];
		}
		System.out.println(r);
	}
}
