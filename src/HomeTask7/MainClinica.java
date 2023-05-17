package HomeTask7;

public class MainClinica {
    public static void main(String[] args) {
        Patient patient = new Patient(3);
        Therapist therapist = new Therapist();
        therapist.prescribeTreatmentPlan(patient);
    }
}
