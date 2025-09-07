	package javaproject;
	
	import java.util.Scanner;
	
	public class forpalindromestring {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String s1= s;
			String rev = " ";
			int n = s.length();
			for(int i =n-1;i>=0;i--) {
				rev+=s.charAt(i);
			}
			if(s1.equals(rev)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome ");
			}
		}
	}
