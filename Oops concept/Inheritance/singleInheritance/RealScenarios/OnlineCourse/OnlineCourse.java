package Inheritance.singleInheritance.RealScenarios.OnlineCourse;

public class OnlineCourse extends Course {
    private String platform;
    private double fee;

    public OnlineCourse(String courseName, int duration, String platform, double fee) {
        super(courseName, duration); // call parent constructor
        this.platform = platform;
        this.fee = fee;
    }

    public void displayFullDetails() {
        // Parent details
        super.displayCourseDetails();
        // Child details
        System.out.println("Platform    : " + platform);
        System.out.println("Fee         : ₹" + fee);
    }
}