package task_1.utils;

import task_1.exceptions.LengthException;
import task_1.exceptions.StartWithException;
import task_1.validate.ValidateDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class InputOutput {
    private static String pathToReportFile = "/Users/ilyamoiseenko/IdeaProjects/TeachMeSkills/src/task_1/files/report.txt";

    private static List<String> inputPath() {
        List<String> files = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("0"))
                break;

            files.add(line);
        }

        return files;
    }

    public static Set<String> getDocumentNumbers() {
        Set<String> documentNumbers = new HashSet<>();
        List<String> files = inputPath();

        for (String file : files) {
            File document = new File(file);

            try (Scanner scanner = new Scanner(document)) {
                while (scanner.hasNext()) {
                    documentNumbers.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return documentNumbers;
    }

    public static void writeToFile(Map<String, String> documentNumbers) {
        try (FileWriter writer = new FileWriter(pathToReportFile, true)) {
            for (Map.Entry<String, String> set : documentNumbers.entrySet()) {
                writer.write(set.getKey() + " - " + set.getValue() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
