import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        InstructorQueue instructorQueue = new InstructorQueue();

        System.out.println("Enter information for 5 instructors:\n");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nInstructor " + i + ":");
            
            System.out.println("First Name: ");
            String firstName = scnr.nextLine();
            
            System.out.println("Last Name: ");
            String lastName = scnr.nextLine();

            System.out.println("Enter course names (separated by a comma): ");
            String courseInput = scnr.nextLine();
            String[] courses = courseInput.split(",");

            // Trim whitespace from each course name
            for (int j = 0; j < courses.length; j++) {
                courses[j] = courses[j].trim();
            }

            InstructorInfo instructor = new InstructorInfo(firstName, lastName, courses);
            instructorQueue.enqueue(instructor);
        }

        System.out.println("\n--- Original Queue ---");
        instructorQueue.displayQueue();

        System.out.println("\n--- Sorted by Last Name (Descending) ---");
        instructorQueue.sortByLastNameDescending();
        instructorQueue.displayQueue();

        System.out.println("\n--- Sorted by Number of Courses (Descending) ---");
        instructorQueue.sortByCoursesDescending();
        instructorQueue.displayQueue();

        scnr.close();
    }
}