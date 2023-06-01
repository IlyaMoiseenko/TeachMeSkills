package task_2;

public class HDD {
    private String _name;
    private double _volume;
    private String _type;

    public HDD() {};

    public HDD(String name, double volume, String type) {
        _name = name;
        _volume = volume;
        _type = type;
    }

    @Override
    public String toString() {
        return "Name: " + this._name +
                " Volume: " + this._volume +
                " Type: " + this._type;
    }
}
