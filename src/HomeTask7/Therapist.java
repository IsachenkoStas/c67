package HomeTask7;

public class Therapist extends Doctors {
    @Override
    void treat() {
        super.treat();
        System.out.println("Провести полный осмотр и назначить план лечения ");
    }

    void prescribeTreatmentPlan(Patient p) {
        if (p.getPlanOfTreatment() == 1) {
            p.setDoctors(new Dentist());
            p.getDoctors().treat();
        } else if (p.getPlanOfTreatment() == 2) {
            p.setDoctors(new Surgeon());
            p.getDoctors().treat();
        } else if (p.getPlanOfTreatment() > 2) {
            p.setDoctors(new Therapist());
            p.getDoctors().treat();
        } else {
            System.out.println("wrong number");
        }
    }
}
