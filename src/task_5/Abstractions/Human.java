package task_5.Abstractions;

public abstract class Human {
    // FIELDS
    private String _name;
    private String _secondName;
    private int _age;

    // CONSTRUCTORS
    public Human(String name, String secondName, int age) {
        _name = name;
        _secondName = secondName;
        _age = age;
    }

    // GETTERS AND SETTERS
    public String GetName() {
        return _name;
    }
    public void SetName(String newName) {
        _name = newName;
    }

    public String GetSecondName() {
        return _secondName;
    }
    public void SetSecondName(String newName) {
        _secondName = newName;
    }

    public int GetAge() {
        return _age;
    }
    public void SetAge(int newAge) {
        _age = newAge;
    }
}
