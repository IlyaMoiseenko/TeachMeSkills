package task_2.Validate;

import task_2.DocumentExceptions.LengthException;
import task_2.DocumentExceptions.StartWithException;

public class ValidDocument {
    private static String[] prefix = new String[] {
            "docnum",
            "contract"
    };

    public static boolean checkLength(String documentNumber) throws LengthException {
        if (documentNumber.length() != 15)
            throw new LengthException("The document number must be 15 characters long");

        return true;
    }

    public static boolean checkStartWith(String documentNumber) throws StartWithException {
        for (String prefix : prefix) {
            if (documentNumber.startsWith(prefix))
                return true;
        }

        throw new StartWithException("The document must begin with the prefix \"docnum\" or \"contract\"");
    }
}
