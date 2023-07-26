package task_1.interfaces.impl;

import task_1.interfaces.DocumentStorage;
import task_1.models.Document;

import java.util.HashSet;
import java.util.Set;

public class InMemoryDocumentStorage implements DocumentStorage {
    private final Set<Document> documents = new HashSet<>();

    @Override
    public void save(Document document) {
        documents.add(document);
    }

    @Override
    public Set<Document> findAll() {
        return documents;
    }
}
