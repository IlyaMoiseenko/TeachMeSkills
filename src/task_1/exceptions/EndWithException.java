package task_1.exceptions;

import task_1.exceptions.baseExceptions.StringException;

public class EndWithException extends StringException {
    public EndWithException(String message) {
        super(message);
    }
}
