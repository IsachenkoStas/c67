package HomeTask7;

public class Patient {
    private int planOfTreatment;
    private Doctors doctors;

    public Patient(int planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
    }

    public int getPlanOfTreatment() {
        return planOfTreatment;
    }

    public void setPlanOfTreatment(int planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}

