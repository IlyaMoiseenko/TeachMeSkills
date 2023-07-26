package task_1.interfaces;

import task_1.exceptions.LenghtException;
import task_1.exceptions.StartWithException;
import task_1.models.Document;

public interface Validation {
    boolean length(Document document) throws LenghtException;
    boolean startWith(Document document) throws StartWithException;
}
