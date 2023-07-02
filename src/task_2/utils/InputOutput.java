package task_2.utils;

import task_2.DocumentExceptions.LengthException;
import task_2.DocumentExceptions.StartWithException;
import task_2.Validate.ValidDocument;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    private final JFileChooser fileChooser = new JFileChooser();
    private final String validNumbersPath = "src/task_2/Files/ValidNumbers.txt";
    private final String notValidNumbersPath = "src/task_2/Files/NotValidNumbers.txt";

    public File chooseFile() {
        int ret = fileChooser.showDialog(null, "Open file");
        if (ret == JFileChooser.APPROVE_OPTION)
            return fileChooser.getSelectedFile();

        return null;
    }

    public void sortNumberToValidAndNotValid(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                try {
                    if (ValidDocument.checkLength(line) && ValidDocument.checkStartWith(line))
                        writeDocumentNumberToFile(line, validNumbersPath);
                } catch (LengthException | StartWithException e) {
                    writeDocumentNumberToFile(
                            line + " - " + e.getMessage(),
                            notValidNumbersPath
                    );
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Please, choose the file");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeDocumentNumberToFile(String number, String path) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(number + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
