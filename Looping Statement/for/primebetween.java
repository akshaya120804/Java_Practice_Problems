package array;

import java.util.Scanner;

public class primebetween{
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
	
		 System.out.println("the prime number between "+a+" and "+b+" are :");

		 for(int i = a; i<b;i++) {
			 boolean prime = true ;

			 for(int j = 2 ; j<i;j++) {
				 if(i%j==0) {
					 prime = false;
					 break;
				 } 
			 }
			 if(prime) {
				 System.out.println(i);
			 }
		 }
	}
}
