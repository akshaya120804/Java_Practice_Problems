package Inheritance.MultipleInheritance.mobile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String deviceName ;
		String brand;
		String os;
		String healthFeatures;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Device Name : ");
		deviceName = sc.nextLine();
		System.out.println("Enter the Brand : ");
		brand = sc.nextLine();
		System.out.println("Enter the OS : ");
		os = sc.nextLine();
		System.out.println("Enter the Health Features : ");
		healthFeatures = sc.nextLine();
		WearableDevice w = new WearableDevice(deviceName,brand,os,healthFeatures);
        w.displayWearable();
	}
}
