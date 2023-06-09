package task_5.Abstractions;

public abstract class Doctor {
    // FIELDS
    private String _position;

    // CONSTRUCTORS
    public Doctor(String position) {
        _position = position;
    }

    // GETTERS AND SETTERS
    public String GetPosition() {
        return _position;
    }
    public void SetPosition(String newPosition) {
        _position = newPosition;
    }

    // METHODS
    public abstract void ToHeal();
}
