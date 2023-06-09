package task_5;

import task_5.Abstractions.Doctor;
import task_5.Abstractions.Human;
import task_5.Doctors.Dentist;
import task_5.Doctors.Surgeon;
import task_5.Doctors.Therapist;

public class Patient extends Human {
    // FIELDS
    private TreatmentPlan _treatmentPlan;
    private Doctor _doctor;

    // CONSTRUCTORS
    public Patient(String name, String secondName, int age, TreatmentPlan treatmentPlan) {
        super(name, secondName, age);

        SetTreatmentPlan(treatmentPlan);
    }

    // GETTERS AND SETTERS
    public TreatmentPlan GetTreatmentPlan() {
        return _treatmentPlan;
    }
    public void SetTreatmentPlan(TreatmentPlan newTreatmentPlan) {
        _treatmentPlan = newTreatmentPlan;

        _setDoctor();
    }

    public Doctor GetDoctor() {
        return _doctor;
    }
    private void _setDoctor() {
        if (_treatmentPlan.GetCode() == 1)
            _doctor = new Surgeon("Surgeon");
        else if (_treatmentPlan.GetCode() == 2)
            _doctor = new Dentist("Dentist");
        else
            _doctor = new Therapist("Therapist");
    }
}
