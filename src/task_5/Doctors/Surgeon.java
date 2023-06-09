package task_5.Doctors;

import task_5.Abstractions.Doctor;

public class Surgeon extends Doctor {
    public Surgeon(String position) {
        super(position);
    }

    @Override
    public void ToHeal() {
        System.out.println("Surgeon");
    }
}
