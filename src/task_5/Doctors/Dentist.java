package task_5.Doctors;

import task_5.Abstractions.Doctor;

public class Dentist extends Doctor {
    public Dentist(String position) {
        super(position);
    }

    @Override
    public void ToHeal() {
        System.out.println("Dentist");
    }
}
