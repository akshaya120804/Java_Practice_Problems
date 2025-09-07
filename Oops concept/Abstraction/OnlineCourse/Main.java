package Abstraction.OnlineCourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a course:");
        System.out.println("1. Programming");
        System.out.println("2. Design");
        System.out.println("3. Marketing");
        int choice = sc.nextInt();

        Course course = null;

        switch(choice) {
            case 1: course = new ProgrammingCourse("Java Programming", 8); break;
            case 2: course = new DesignCourse("UI/UX Design", 6); break;
            case 3: course = new MarketingCourse("Digital Marketing", 10); break;
            default: System.out.println("Invalid choice!"); return;
        }

        // Abstraction in action
        course.showDetails();
        course.enroll();
        course.getMaterial();

        sc.close();
    }
}