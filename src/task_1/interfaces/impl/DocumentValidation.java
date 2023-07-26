package task_1.interfaces.impl;

import task_1.exceptions.LenghtException;
import task_1.exceptions.StartWithException;
import task_1.interfaces.Validation;
import task_1.models.Document;
import task_1.utils.Utils;

public class DocumentValidation implements Validation {
    private String[] prefix = Utils.getPrefix();
    private final int MAX_LENGTH = 15;

    @Override
    public boolean length(Document document) throws LenghtException {
        if (document.getNumber().length() != MAX_LENGTH)
            throw new LenghtException("The document number must be 15 characters long");

        return true;
    }

    @Override
    public boolean startWith(Document document) throws StartWithException {
        for (String prefix : prefix) {
            if (document.getNumber().startsWith(prefix))
                return true;
        }

        throw new StartWithException("The document must begin with the prefix \"docnum\" or \"contract\"");
    }
}
