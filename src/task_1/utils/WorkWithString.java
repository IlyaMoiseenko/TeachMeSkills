package task_1.utils;

import task_1.exceptions.ContainsSequence;
import task_1.exceptions.EndWithException;
import task_1.exceptions.StartWithException;

public class WorkWithString {
    /*
    Проверить содержит ли номер документа последовательность abc и
    вывети сообщение содержит или нет(причем, abc и ABC считается
    одинаковой последовательностью).
    */
    public static boolean ContainsSubString(String number, String subString) throws ContainsSequence {
        if (!number.toLowerCase().contains(subString.toLowerCase()))
            throw new ContainsSequence("The string does not contains sequence ---> " + subString);

        return true;
    }

    /*
    Проверить начинается ли номер документа с последовательности 555
    */
    public static boolean StartWith(String number, String prefix) throws StartWithException {
        if (!number.startsWith(prefix))
            throw new StartWithException("The string does not start with ---> " + prefix);

        return true;
    }

    /*
    Проверить заканчивается ли номер документа на последовательность 1a2b
    */
    public static boolean EndWith(String number, String prefix) throws EndWithException {
        if (!number.endsWith(prefix))
            throw new EndWithException("The string does not end with ---> " + prefix);

        return true;
    }
}
