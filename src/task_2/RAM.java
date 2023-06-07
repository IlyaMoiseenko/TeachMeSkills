package task_2;

public class RAM {
    // FIELDS
    private String _name;
    private double _volume;

    // CONSTRUCTORS
    public RAM() {}

    public RAM(String name, double volume) {
        _name = name;
        _volume = volume;
    }

    // GETTERS AND SETTERS
    public String GetName() {
        return _name;
    }
    public void SetName(String newName) {
        _name = newName;
    }

    public double GetVolume() {
        return _volume;
    }
    public void SetVolume(double newVolume) {
        _volume = newVolume;
    }

    // METHODS
    @Override
    public String toString() {
        return "Name: " + this._name +
                " Volume: " + this._volume;
    }
}
