package task_1.services;

import task_1.interfaces.Reader;
import task_1.interfaces.Writer;
import task_1.interfaces.impl.ConsoleReader;
import task_1.interfaces.impl.ConsoleWriter;
import task_1.models.Document;

import java.util.ArrayList;
import java.util.List;

public class ConsoleService {
    private Reader consoleReader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();

    public List<String> getPath() {
        List<String> documents = new ArrayList<>();

        while (true) {
            writer.write("Enter path to file: ");
            String pathToDocument = consoleReader.read();

            if (pathToDocument.equals("0")) {
                break;
            }

            documents.add(pathToDocument);
        }

        return documents;
    }
}
