package HomeTask7;

public class MainClinica {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setPlanOfTreatment(3);
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();
        therapist.treatmentPlan = patient.getPlanOfTreatment();
        therapist.prescribeTreatmentPlan();
    }
}
