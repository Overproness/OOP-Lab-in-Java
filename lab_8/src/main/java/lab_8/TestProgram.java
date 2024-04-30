package lab_8;
import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {
        // Create instances of Person, Student, Employee, Faculty, and Staff
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john.doe@example.com");
        Student student = new Student("Alice Smith", "456 Elm St", "456-789-0123", "alice.smith@example.com", "Freshman");
        Employee employee = new Employee("Bob Johnson", "789 Oak St", "789-012-3456", "bob.johnson@example.com", "Office A", 50000, new Date());
        Faculty faculty = new Faculty("Charlie Brown", "321 Pine St", "987-654-3210", "charlie.brown@example.com", "Office B", 60000, new Date(), "9:00 AM - 5:00 PM", "Professor");
        Staff staff = new Staff("Diana Miller", "654 Cedar St", "210-987-6543", "diana.miller@example.com", "Office C", 40000, new Date(), "Secretary");

        // Invoke toString() methods
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

