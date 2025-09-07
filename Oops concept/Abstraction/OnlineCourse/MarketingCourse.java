package Abstraction.OnlineCourse;

class MarketingCourse extends Course {
    MarketingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void getMaterial() {
        System.out.println("Marketing materials: Live sessions + Group projects.");
    }

    @Override
    void enroll() {
        System.out.println("You have been enrolled in Marketing Course.");
    }
}
