package lab_8;

import java.util.Date;

// Parent class Person
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    // Constructor
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Subclass Student
class Student extends Person {
    public static final String[] CLASS_STATUS = {"Freshman", "Sophomore", "Junior", "Senior"};
    private String status;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student: " + name;
    }
}

// Parent class Employee
class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

// Subclass Faculty
class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    // Constructor
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

// Subclass Staff
class Staff extends Employee {
    protected String title;

    // Constructor
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Staff: " + name;
    }
}
