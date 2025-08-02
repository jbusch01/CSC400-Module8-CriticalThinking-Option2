 public class InstructorInfo {
    private String firstName;
    private String lastName;
    private String courseName;
    private int numCourses;

    // Constuctor
    public InstructorInfo(String firstName, String lastName, String courseName, int numCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.numCourses = numCourses;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumCourses() {
        return numCourses;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    // toString method for standardized output
    @Override
    public String toString() {
        return lastName + ", " + firstName + " (Courses: " + numCourses + ")";
    }
 }