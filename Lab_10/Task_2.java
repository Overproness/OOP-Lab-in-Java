public class Task_2 {
    public static void main(String[] args) {
        Employee emp1 = new Manager("John Doe", 50000);
        Employee emp2 = new Engineer("Jane Smith", 60000);

        System.out.println("Employee: " + emp1.getName() + ", Job Title: " + emp1.getJobTitle() + ", Bonus: $" + emp1.calculateBonus());
        System.out.println("Employee: " + emp2.getName() + ", Job Title: " + emp2.getJobTitle() + ", Bonus: $" + emp2.calculateBonus());
    }
}

class Employee{
    String name;
    double salary;
    String jobTitle;

    public Employee(String name, double salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        // Default bonus calculation
        return 0.05 * salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

}

class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        // Manager's bonus calculation
        return 0.1 * getSalary();
    }

}


class Engineer extends Employee {
    public Engineer(String name, double salary) {
        super(name, salary, "Engineer");
    }

    @Override
    public double calculateBonus() {
        // Engineer's bonus calculation
        return 0.08 * getSalary();
    }
}


