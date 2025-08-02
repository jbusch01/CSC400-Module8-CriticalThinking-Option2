 public class InstructorInfo {
    private String firstName;
    private String lastName;
    private String[] courseNames;
    private int numCourses;

    // Constructor
    public InstructorInfo(String firstName, String lastName, String[] courseNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNames = courseNames;
        this.numCourses = courseNames.length;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getCourseNames() {
        return courseNames;
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

    public void setCourseNames(String[] courseNames) {
        this.courseNames = courseNames;
        this.numCourses = courseNames.length;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    // toString method for standardized output
    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();
        for (int i = 0; i < courseNames.length; i++ ) {
            courseList.append(courseNames[i]);
            if (i < courseNames.length - 1) {
                courseList.append(", ");
            }
        }
        return lastName + ", " + firstName + " | Courses (" + numCourses + "): " + courseList.toString();
    }
 }