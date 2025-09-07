package sample;

import java.util.Scanner;

public class reverse_num_func {
	static boolean reverse(int num) {
		int rev=0,sum=0,a=0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10; 
        }
        while(rev!=0){
            a=a*10+(rev%10);
            rev/=10;
        }
        if(num==a){
            return true;
        }
        else{
            return false;
        }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		System.out.println(reverse(num));
		
	}
}

