package task_1.services;

import task_1.interfaces.DocumentStorage;
import task_1.interfaces.impl.InMemoryDocumentStorage;
import task_1.models.Document;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FileService {
    private DocumentStorage documentStorage = new InMemoryDocumentStorage();

    public Set<Document> getAll(List<String> path) {
        for (String file : path) {
            try (Scanner scanner = new Scanner(new File(file))) {
                while (scanner.hasNext()) {
                    documentStorage.save(new Document(scanner.nextLine()));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return documentStorage.findAll();
    }

    public void put(Map<Document, String> documents, String pathToReportFile) {
        try (FileWriter writer = new FileWriter(pathToReportFile, true)) {
            for (Map.Entry<Document, String> set : documents.entrySet()) {
                writer.write(set.getKey().getNumber() + " - " + set.getValue() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
