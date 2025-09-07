package zoho;

import java.util.Scanner;

public class sundays {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String startday = sc.next();
		int startindex = 0;
		String []days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(int i =0 ;i<7;i++) {
			if(startday.equals(days[i])) {
				startindex = i;
				break;
			}
		}
		int remday = (7-startindex)%7;
		int count = 0;
		for(int i = remday;i<n;i+=7) {
			count++;
		}
		System.out.println(count);
	}
}
