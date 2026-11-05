import java.util.*;

class HospitalPatient {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        patients.add("Aman");
        patients.add("Rohit");
        patients.add("Priya");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        patients.remove("Rohit");
        ids.remove("P102");

        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + ids);

        if (patients.contains("Aman")) {
            System.out.println("Aman Found");
        } else {
            System.out.println("Aman Not Found");
        }
    }
}