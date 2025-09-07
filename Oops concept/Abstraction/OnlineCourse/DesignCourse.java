package Abstraction.OnlineCourse;

class DesignCourse extends Course {
    DesignCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void getMaterial() {
        System.out.println("Design materials: Case studies + Assignments.");
    }

    @Override
    void enroll() {
        System.out.println("You have been enrolled in Design Course.");
    }
}