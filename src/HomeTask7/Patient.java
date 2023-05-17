package HomeTask7;

public class Patient {
    private int planOfTreatment;
    private String doc;

    public int getPlanOfTreatment() {
        return planOfTreatment;
    }

    public void setPlanOfTreatment(int planOfTreatment) {
        if (planOfTreatment < 0) {
            throw new IllegalArgumentException
                    ("Значение value должно быть положительным числом!");
        }
        this.planOfTreatment = planOfTreatment;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
