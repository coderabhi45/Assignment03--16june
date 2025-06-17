package Package05;

public class PersonTest {
    public static void main(String[] args) {
        // Creating Student object
        Student student = new Student("Alice", 16, "10th Grade");

        // Creating Teacher object
        Teacher teacher = new Teacher("Mr. Sharma", 35, "Mathematics");

        // Display details
        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
    }
}
