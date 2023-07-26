package task_1.services;

import task_1.exceptions.LenghtException;
import task_1.exceptions.StartWithException;
import task_1.interfaces.Validation;
import task_1.interfaces.impl.DocumentValidation;
import task_1.models.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DocumentService {
    private Validation validation = new DocumentValidation();

    public Map<Document, String> validateDocuments(Set<Document> documents) {
        Map<Document, String> validatedDocuments = new HashMap<>();

        for (Document document : documents) {
            try {
                if (validation.length(document) && validation.startWith(document)) {
                    document.setValid(true);
                    validatedDocuments.put(document, "Valid");
                }
            } catch (LenghtException | StartWithException e) {
                validatedDocuments.put(document, e.getMessage());
            }
        }

        return validatedDocuments;
    }
}
