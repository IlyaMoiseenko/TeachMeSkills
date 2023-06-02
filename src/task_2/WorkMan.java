package task_2;

import task_2.Abstractions.Worker;
import task_2.Interfaces.IWorker;

public class WorkMan extends Worker implements IWorker {
    public WorkMan(String _position) {
        super(_position);
    }

    @Override
    public void PrintPosition() {
        System.out.println(_position);
    }
}
