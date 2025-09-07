package Inheritance.singleInheritance.RealScenarios.OnlineCourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter duration (in weeks): ");
        int duration = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter platform name: ");
        String platform = sc.nextLine();

        System.out.print("Enter course fee: ");
        double fee = sc.nextDouble();
        
        OnlineCourse oc = new OnlineCourse(courseName, duration, platform, fee);

        System.out.println("\n----- Course Details -----");
        oc.displayFullDetails();

        sc.close();
    }
}