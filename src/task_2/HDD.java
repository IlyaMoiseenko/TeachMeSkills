package task_2;

public class HDD {
    // FIELDS
    private String _name;
    private double _volume;
    private String _type;

    // CONSTRUCTORS
    public HDD() {};

    public HDD(String name, double volume, String type) {
        _name = name;
        _volume = volume;
        _type = type;
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

    public String GetType() {
        return _type;
    }
    public void SetType(String newType) {
        _type = newType;
    }

    // METHODS
    @Override
    public String toString() {
        return "Name: " + this._name +
                " Volume: " + this._volume +
                " Type: " + this._type;
    }
}
