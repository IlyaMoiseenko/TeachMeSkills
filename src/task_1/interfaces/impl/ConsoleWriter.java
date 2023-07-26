package task_1.interfaces.impl;

import task_1.interfaces.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String message) {
        System.out.print(message);
    }
}
