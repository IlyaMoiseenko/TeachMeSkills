package task_1.Abstractions;

public abstract class Figure {
    private String _name;

    public Figure(String name) {
        _name = name;
    }

    public abstract double GetSquare();

    public abstract double GetArea();

    public void DisplayInfo() {
        System.out.println(_name);
    }
}
