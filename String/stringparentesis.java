package javaproject;

import java.util.Scanner;

public class stringparentesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count =0;
		int n = st.length()-1;
		char [] ch = st.toCharArray();
		for(int i = 0 ;i<=n;i++) {
			if(ch[i]=='(') count ++;
			else if(ch[i]==')') count --;
		}
		if(count == 0) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}
}
