package task_1.interfaces;

import task_1.models.Document;

import java.util.Set;

public interface DocumentStorage {
    void save(Document document);
    Set<Document> findAll();
}
