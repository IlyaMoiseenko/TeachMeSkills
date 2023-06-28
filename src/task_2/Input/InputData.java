package task_2.Input;

import task_2.Exceptions.BaseExceptions.InputDataException;
import task_2.Validate.ValidateInputData;

public class InputData {
    public static boolean checkInputData(String login, String password, String confirmPassword) throws InputDataException {
        return ValidateInputData.loginValidate(login) && ValidateInputData.validatePassword(password, confirmPassword);
    }
}
