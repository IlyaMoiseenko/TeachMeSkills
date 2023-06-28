package task_1.exceptions;

import task_1.exceptions.baseExceptions.StringException;

public class StartWithException extends StringException {
    public StartWithException(String message) {
        super(message);
    }
}
