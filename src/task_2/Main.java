package task_2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Director");
        director.PrintPosition();

        WorkMan workMan = new WorkMan("Workman");
        workMan.PrintPosition();

        Accountant accountant = new Accountant("Accountant");
        accountant.PrintPosition();
    }
}
