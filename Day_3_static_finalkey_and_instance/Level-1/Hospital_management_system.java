class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName +
                    ", Name: " + name +
                    ", Age: " + age +
                    ", Ailment: " + ailment +
                    ", Patient ID: " + patientID);
        }
    }
}

public class Hospital_management_system {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ramesh", 40, "Flu", 1001);
        Patient p2 = new Patient("Sita", 30, "Fracture", 1002);

        p1.displayPatient();
        p2.displayPatient();
        Patient.getTotalPatients();
    }
}
