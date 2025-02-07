class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
            double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getDiscountedPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + getDiscountedPrice());
    }
}

// Main class
public class CourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 6);
        course.displayCourseInfo();
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("JavaScript", 8, "Coursera", true);
        onlineCourse.displayCourseInfo();
        System.out.println();

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("MERN", 12, "Udemy", true, 500, 20);
        paidCourse.displayCourseInfo();
    }
}
