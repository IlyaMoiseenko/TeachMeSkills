package task_1.validate;

import task_1.exceptions.LengthException;
import task_1.exceptions.StartWithException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidateDocument {
    private static String[] prefix = new String[] {
            "docnum",
            "contract"
    };

    private static final int MAXLENGTH = 15;

    private static boolean checkLength(String documentNumber) throws LengthException {
        if (documentNumber.length() != MAXLENGTH)
            throw new LengthException("The document number must be 15 characters long");

        return true;
    }

    private static boolean checkStartWith(String documentNumber) throws StartWithException {
        for (String prefix : prefix) {
            if (documentNumber.startsWith(prefix))
                return true;
        }

        throw new StartWithException("The document must begin with the prefix \"docnum\" or \"contract\"");
    }

    public static Map<String, String> validDocumentNumbers(Set<String> documentNumbers) {
        Map<String, String> numbers = new HashMap<>();

        for (String number : documentNumbers) {
            try {
                if (ValidateDocument.checkLength(number) && ValidateDocument.checkStartWith(number)) {
                    numbers.put(number, "Valid");
                }
            } catch (LengthException | StartWithException e) {
                numbers.put(number, e.getMessage());
            }
        }

        return numbers;
    }
}
