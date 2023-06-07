package task_2;

public class Computer {
    // FIELDS
    private RAM _ram;
    private HDD _hdd;
    private double _cost;
    private String _model;

    // CONSTRUCTORS
    public Computer(double cost, String model) {
        _cost = cost;
        _model = model;

        _ram = new RAM();
        _hdd = new HDD();
    }

    public Computer(RAM ram, HDD hdd, double cost, String model) {
        _ram = ram;
        _hdd = hdd;
        _cost = cost;
        _model = model;
    }

    // GETTERS AND SETTERS
    public RAM GetRAM() {
        return _ram;
    }
    public void SetRAM(RAM newRAM) {
        _ram = newRAM;
    }

    public HDD GetHDD() {
        return _hdd;
    }
    public void SetHDD(HDD newHDD) {
        _hdd = newHDD;
    }

    public double GetCoast() {
        return _cost;
    }
    public void SetCoast(double newCoast) {
        _cost = newCoast;
    }

    public String GetModel() {
        return _model;
    }
    public void SetModel(String newModel) {
        _model = newModel;
    }

    // METHODS
    @Override
    public String toString() {
        return "Ram: " + this._ram +
                " HDD: " + this._hdd +
                " Coast: " + this._cost +
                " Model: " + this._model;
    }
}
