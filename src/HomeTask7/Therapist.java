package HomeTask7;

public class Therapist extends Doctors {
    int treatmentPlan;

    @Override
    void treat() {
        super.treat();
        System.out.println("Провести полный осмотр и назначить план лечения ");
    }

    void prescribeTreatmentPlan() {
        Patient p = new Patient();
        Therapist t = new Therapist();
        Dentist d = new Dentist();
        Surgeon s = new Surgeon();
        if (treatmentPlan == 1) {
            p.setDoc("Dentist");
            d.treat();
        //    System.out.println("dentist");
        } else if (treatmentPlan == 2) {
            p.setDoc("Surgeon");
            s.treat();
       //     System.out.println("surgeon");
        } else if (treatmentPlan > 2) {
            p.setDoc("Therapist");
            t.treat();
        //    System.out.println("therapist");
        } else {
            System.out.println("wrong number");
        }
    }
}
