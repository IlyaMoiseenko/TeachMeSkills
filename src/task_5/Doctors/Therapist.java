package task_5.Doctors;

import task_5.Abstractions.Doctor;

public class Therapist extends Doctor {
    public Therapist(String position) {
        super(position);
    }

    @Override
    public void ToHeal() {
        System.out.println("Therapist");
    }
}
