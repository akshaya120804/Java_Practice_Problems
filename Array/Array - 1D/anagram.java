package array;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b  = sc.next();
		String s = a.toLowerCase();
		String t = b.toLowerCase();
		int n = a.length();
		int m = b.length();
		if(n!=m) {
			System.out.println("not anagram");
		}
		char [] a1=s.toCharArray();
		char [] a2=t.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1,a2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}

	}

}
