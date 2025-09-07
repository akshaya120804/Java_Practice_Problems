package Abstraction.OnlineCourse;

abstract class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Abstract methods - must be implemented
    abstract void getMaterial();
    abstract void enroll();

    // Common method (implemented once, reused)
    void showDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}