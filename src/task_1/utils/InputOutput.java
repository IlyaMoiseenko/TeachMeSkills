package task_1.utils;

import task_1.Exceptions.DocumentExceptions.LengthException;
import task_1.Exceptions.DocumentExceptions.StartWithException;
import task_1.Validate.ValidDocument;

import javax.swing.JFileChooser;
import java.io.*;
import java.util.Scanner;

public class InputOutput {
    private final JFileChooser fileChooser = new JFileChooser();

    public File chooseFile() {
        int ret = fileChooser.showDialog(null, "Open file");
        if (ret == JFileChooser.APPROVE_OPTION)
            return fileChooser.getSelectedFile();

        return null;
    }

    public void outputFileToConsole(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                try {
                    String line = scanner.nextLine();

                    if (ValidDocument.checkLength(line) && ValidDocument.checkStartWith(line))
                        System.out.println(line);
                } catch (LengthException | StartWithException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Please, choose the file");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
