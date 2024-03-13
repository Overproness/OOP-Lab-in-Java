package Task_4;

import java.util.ArrayList;

public class Patient {
    String name;
    static int id;
    int age;
    String medicalCondition;
    ArrayList<Patient> allPatients=new ArrayList<>();

    Patient(String _name, int _age,String _medicalCondition){
        name=_name;
        age=_age;
        medicalCondition=_medicalCondition;
        id++;
    }

    public Patient addNewPaitient(String _name, int _age,String _medicalCondition){
        Patient somePatient = new Patient(_name,_age,_medicalCondition);
        allPatients.add(somePatient);
        return somePatient;
    }

    public Patient searchPaitientById(int _id){
        for(Patient patient:allPatients){
            if(patient.id==_id)
                return patient;
        }
        return null;
    }

    public void displayInfo(){
    System.out.println("The name of the Patient is: "+name+
    "\nThe age of the Patient is: "+age+
    "\nThe id of the patient is: "+id+
    "\nThe medical condition of the patient is: "+medicalCondition);
    }

    public static void main(String[] args) {
        Patient patient1=new Patient("Ahmed Mabood", 200, "Khujli ki bimaari ka mareez.");
        patient1.age=201;
        patient1.displayInfo();
    }

}
