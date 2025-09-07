package zoho;

import java.util.Scanner;

public class toggle {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int n = Integer.toBinaryString(a).length();
		int mask = (1<<n)-1;
		int toggle = a^mask;
		System.out.println(toggle);
		
	}
}
