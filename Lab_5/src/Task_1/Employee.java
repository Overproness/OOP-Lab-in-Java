package Task_1;
public class Employee {
    String name;
    String position;
    double salary;
    static int id;

    Employee(String _name, String _position, double _salary){
        name=_name;
        position=_position;
        salary=_salary;
        id++;
    }

    public void displayInfo(){
        System.out.println("The name of the Employee is: "+name+
        "\nThe Position of the Employee is: "+position+
        "\nThe salary of the Employee is: "+salary+
        "\nThe id of the Employee is: "+id);
    }
}
