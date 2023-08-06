package task_1;

public class Task1 {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final Validator validator = new Validator();

    public void start() {
        writer.write("Enter ip address: ");
        String address = reader.readLine();

        if (validator.validate(address))
            writer.write("Valid");
        else
            writer.write("Not valid");
    }
}
