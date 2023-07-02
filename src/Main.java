import task_2.utils.InputOutput;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        File file = inputOutput.chooseFile();

        inputOutput.sortNumberToValidAndNotValid(file);
    }
}