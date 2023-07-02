import task_1.utils.InputOutput;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        File file = inputOutput.chooseFile();

        inputOutput.outputFile(file);
    }
}