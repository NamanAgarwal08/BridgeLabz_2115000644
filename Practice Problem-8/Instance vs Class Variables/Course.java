public class Course {

    private String courseName;
    private int duration;
    private int fee;

    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName + "\nDuration: " + this.duration + " months" + "\nFee: " + this.fee);
    }

    public static void updateInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFee() {
        return this.fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
