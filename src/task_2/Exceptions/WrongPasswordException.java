package task_2.Exceptions;

import task_2.Exceptions.BaseExceptions.InputDataException;

public class WrongPasswordException extends InputDataException {
    public WrongPasswordException() {}

    public WrongPasswordException(String message) {
        super(message);
    }
}
