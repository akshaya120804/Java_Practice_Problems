package javaproject;

import java.util.Scanner;

public class switcheb {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int unit = sc.nextInt();
		float bill =0;
		if(unit >0 && unit <=50) {
			bill = unit*0.50f;
		}
		else if(unit>50 && unit <=150) {
			bill = 50*0.50f + (unit-50)*0.75f;
		}
		else if(unit>150 && unit<=250) {
			bill = 50*0.50f + 100*0.75f+(unit - 150)*1.20f;
		}
		else {
			bill = 50*0.50f + 100*0.75f+100*1.20f+(unit - 250)*1.50f;
		}
		bill += bill*0.2f;
		System.out.println("FINAL BILL : "+bill);
	}
}
