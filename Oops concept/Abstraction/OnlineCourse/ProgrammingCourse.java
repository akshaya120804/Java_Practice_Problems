package Abstraction.OnlineCourse;

class ProgrammingCourse extends Course {
    ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void getMaterial() {
        System.out.println("Programming materials: Coding exercises + Video tutorials.");
    }

    @Override
    void enroll() {
        System.out.println("You have been enrolled in Programming Course.");
    }
}