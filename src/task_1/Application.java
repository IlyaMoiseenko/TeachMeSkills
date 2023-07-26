package task_1;

import task_1.interfaces.Writer;
import task_1.interfaces.impl.ConsoleWriter;
import task_1.models.Document;
import task_1.services.ConsoleService;
import task_1.services.DocumentService;
import task_1.services.FileService;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {
    private Writer writer = new ConsoleWriter();
    private final ConsoleService consoleService = new ConsoleService();
    private final FileService fileService = new FileService();
    private DocumentService documentService = new DocumentService();

    public void start() {
        writer.write("Enter path to files: ");
        List<String> pathToDocuments = consoleService.getPath();

        Set<Document> documents = fileService.getAll(pathToDocuments);
        Map<Document, String> validatedDocuments = documentService.validateDocuments(documents);
        fileService.put(validatedDocuments, "/Users/ilyamoiseenko/IdeaProjects/TeachMeSkills/src/task_1/resources/report.txt");
    }
}
