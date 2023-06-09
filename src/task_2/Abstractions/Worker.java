package task_2.Abstractions;

public abstract class Worker {
    // FIELDS
    protected String _position;

    // CONSTRUCTORS
    public Worker(String _position) {
        this._position = _position;
    }

    // GETTERS AND SETTERS
    public String GetPosition() {
        return _position;
    }
    public void SetPosition(String newPosition) {
        _position = newPosition;
    }
}
