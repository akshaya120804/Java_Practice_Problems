package javaproject;

import java.util.Scanner;

public class switchmonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String  month = sc.next();
		switch(month) {
		case "January":
		{
			System.out.println("Its January . It has 31 days.");
			break;
		}
		case "February":
		{
			System.out.println("Its February . It has 28 or 29 days.");
			break;
		}
		case "March":
		{
			System.out.println("Its March . It has 31 days.");
			break;
		}
		case "April":
		{
			System.out.println("Its April . It has 30 days.");
			break;

		}
		case "May":
		{
			System.out.println("Its May . It has 31 days.");
			break;

		}
		case "June":
		{
			System.out.println("Its June . It has 30 days.");
			break;

		}
		case "July":
		{
			System.out.println("Its July . It has 31 days.");
			break;

		}
		case "August":
		{
			System.out.println("Its August . It has 31 days.");
			break;

		}
		case "September":
		{
			System.out.println("Its September . It has 30 days.");
			break;

		}
		case "October":
		{
			System.out.println("Its October . It has 31 days.");
			break;

		}
		case "November":
		{
			System.out.println("Its november . It has 30 days.");
			break;

		}
		case "December":
		{
			System.out.println("Its December . It has 31 days.");
			break;

		}
		default:
		{
			System.out.println("Enter the valid input");
			break;
		}

		}
	}
}
