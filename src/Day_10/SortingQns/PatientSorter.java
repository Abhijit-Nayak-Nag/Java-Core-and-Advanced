package Day_10.SortingQns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Patient{
    String name;
    int age;
    int severity;
    public Patient(String name, int age, int severity){
        this.name=name;
        this.age=age;
        this.severity=severity;
    }
}
public class PatientSorter{
    public static void main(String[] args) {
        List<Patient>patients=new ArrayList<>();
        patients.add(new Patient("John", 35, 7));
        patients.add(new Patient("Alice", 25, 5));
        patients.add(new Patient("Bob", 45, 9));
        patients.add(new Patient("Abhijit", 30, 9));
        sortPatients(patients);
        for(Patient p : patients){
            System.out.println(p.name +" - Age :" + p.age + " - Severity" );
        }

    }
    public static void sortPatients(List<Patient>patients){
        Collections.sort(patients, new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2){
                int severityCompaision = Integer.compare(p2.severity,p1.severity);
                if(severityCompaision!=0){
                    return severityCompaision;
                }
                return Integer.compare(p1.age, p2.age);
            }
        });
    }

}
