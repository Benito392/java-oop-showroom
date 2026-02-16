import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        StudentRecord student = new StudentRecord(id, name, course);
        System.out.println();
        System.out.println("Student Details:");
        student.displayInfo();

        scanner.close();
    }
}
