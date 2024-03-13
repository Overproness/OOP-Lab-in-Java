package Task_2;

public class Student {
    String name;
    static int rollNo;
    int[] grades;

    Student(String _name,int... _grades){
        name=_name;
        grades=_grades;
        rollNo++;
    }


    public Student addStudent(String _name,int... _grades){
        return new Student(_name, grades);
    }

    public double avgGrades(){
        int sum=0;
        for(int grade:grades){
            sum+=grade;
        }
        return sum/grades.length;
    }

    public void displayInfo(){
        System.out.println("The name of the Student is: "+name+
        "\nThe Roll No of the Employee is: "+rollNo+"\nThe Grades of the student are: ");
        for(int grade:grades){
            System.out.println(grade);
        }
    }

    public static void main(String[] args) {
        Student student1=new Student("Ahmed Mabood", 32,324,42,32,32);
        Student student2=student1.addStudent("Koi nai", 23,23,2);
        System.out.println("The average Grades of the Student are: "+student2.avgGrades());
        student1.displayInfo();
    }
}
