package task_2;

public class Computer {
    private RAM _ram;
    private HDD _hdd;
    private double _cost;
    private String _model;

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

    @Override
    public String toString() {
        return "Ram: " + this._ram +
                " HDD: " + this._hdd +
                " Coast: " + this._cost +
                " Model: " + this._model;
    }
}
