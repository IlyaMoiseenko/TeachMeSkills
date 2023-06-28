package task_2.Exceptions;

import task_2.Exceptions.BaseExceptions.InputDataException;

public class WrongLoginException extends InputDataException {
    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
