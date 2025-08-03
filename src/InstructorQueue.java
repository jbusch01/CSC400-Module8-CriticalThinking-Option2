import java.util.ArrayList;

public class InstructorQueue {
    private ArrayList<InstructorInfo> queue;

    public InstructorQueue() {
        queue = new ArrayList<>();
    }
    
    // Add an instructor to the queue
    public void enqueue(InstructorInfo instructor) {
        queue.add(instructor);
    }

    // Display all instructors in the queue
    public void displayQueue() {
        for (InstructorInfo instructor : queue) {
            System.out.println(instructor);
        }
    }

    // Quick sort - public interface
    public void sortByLastNameDescending() {
        quickSortByLastName(0, queue.size() - 1);
    }

    public void sortByCoursesDescending() {
        quickSortByCourses(0, queue.size() - 1);
    }
    
    // QuickSort by last name (descending)
    private void quickSortByLastName(int low, int high) {
        if (low < high) {
            int pivotIndex = partitionByLastName(low, high);
            quickSortByLastName(low, pivotIndex - 1);
            quickSortByLastName(pivotIndex + 1, high);
        }
    }

    private int partitionByLastName(int low, int high) {
        String pivot = queue.get(high).getLastName();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // Descending: compareTo < 0 becomes > 0
            if (queue.get(j).getLastName().compareToIgnoreCase(pivot) > 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    // QuickSort by number of courses (descending)
    private void quickSortByCourses(int low, int high) {
        if (low < high) {
            int pivotIndex = partitionByCourses(low, high);
            quickSortByCourses(low, pivotIndex - 1);
            quickSortByCourses(pivotIndex + 1, high);
        }
    }
    private int partitionByCourses(int low, int high) {
        int pivot = queue.get(high).getNumCourses();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (queue.get(j).getNumCourses() > pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    // Swap helper
    private void swap(int i, int j) {
        InstructorInfo temp = queue.get(i);
        queue.set(i, queue.get(j));
        queue.set(j, temp);
    }
}