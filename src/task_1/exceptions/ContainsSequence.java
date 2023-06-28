package task_1.exceptions;

import task_1.exceptions.baseExceptions.StringException;

public class ContainsSequence extends StringException {
    public ContainsSequence(String message) {
        super(message);
    }
}
