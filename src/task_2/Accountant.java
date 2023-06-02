package task_2;

import task_2.Abstractions.Worker;
import task_2.Interfaces.IWorker;

public class Accountant extends Worker implements IWorker {
    public Accountant(String _position) {
        super(_position);
    }

    @Override
    public void PrintPosition() {
        System.out.println(_position);
    }
}
