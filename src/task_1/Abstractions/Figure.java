package task_1.Abstractions;

public abstract class Figure {
    // FIELDS
    private String _name;

    // CONSTRUCTORS
    public Figure(String name) {
        _name = name;
    }

    // GETTERS AND SETTERS
    public String GetName() {
        return _name;
    }
    public void SetName(String newName) {
        _name = newName;
    }

    // METHODS
    public abstract double GetSquare();

    public abstract double GetArea();

    public void DisplayInfo() {
        System.out.println(_name);
    }
}
