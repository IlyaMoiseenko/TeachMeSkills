package task_2.Validate;

import task_2.Exceptions.WrongLoginException;
import task_2.Exceptions.WrongPasswordException;

import java.util.Arrays;

public class ValidateInputData {
    public static boolean loginValidate(String login) throws WrongLoginException {
        if (checkLength(login) || checkSpace(login))
            throw new WrongLoginException("The login must be no more than 20 characters and does not contain spaces");

        return true;
    }

    public static boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (checkLength(password) || checkSpace(password) || !checkDigitsInPassword(password))
            throw new WrongPasswordException("The password must be no more than 20 characters and does not contain spaces and contains one digit");

        if (!equalsPassword(password, confirmPassword))
            throw new WrongPasswordException("Passwords don't match");

        return true;
    }

    private static boolean checkDigitsInPassword(String password) {
        char[] charArrayOfPassword = password.toCharArray();
        Arrays.sort(charArrayOfPassword);

        return Character.isDigit(charArrayOfPassword[0]);
    }

    private static boolean equalsPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    private static boolean checkLength(String text) {
        return text.length() > 20;
    }

    private static boolean checkSpace(String text) {
        return text.contains(" ");
    }
}
