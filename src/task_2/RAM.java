package task_2;

public class RAM {
    private String _name;
    private double _volume;

    public RAM() {}

    public RAM(String name, double volume) {
        _name = name;
        _volume = volume;
    }

    @Override
    public String toString() {
        return "Name: " + this._name +
                " Volume: " + this._volume;
    }
}
