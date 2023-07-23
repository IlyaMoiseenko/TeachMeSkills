package inputOutput;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
    private static final String fileNameOfHistory = "history.txt";

    public static void writeToFile(String data) {
        try (FileWriter fileWriter = new FileWriter(fileNameOfHistory, true)) {
            fileWriter.write(data);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getHistory() {
        try (Scanner scanner = new Scanner(new File(fileNameOfHistory))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
