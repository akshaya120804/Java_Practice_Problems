package zoho;

import java.util.Scanner;

public class maxa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = sc.nextInt();
		int n = s.length();
		int max=0;
		for(int i = 0;i<n;i+=l) {
			String st = s.substring(i, Math.min(i+l, n));
			int count =0;
			for(int j =0 ;j<st.length();j++) {
			 	if(st.charAt(j)=='a') {
					count++;
				}
			}
			if(count>max) max= count;
		}
		System.out.println(max);
	}
}
