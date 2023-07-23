import task_1.utils.InputOutput;
import task_1.validate.ValidateDocument;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        /Users/ilyamoiseenko/IdeaProjects/TeachMeSkills/src/task_1/files/documentNumbers#1.txt
        */
        System.out.println("Input path to files: ");
        Set<String> documents = InputOutput.getDocumentNumbers();
        Map<String, String> valid = ValidateDocument.validDocumentNumbers(documents);
        InputOutput.writeToFile(valid);
    }
}