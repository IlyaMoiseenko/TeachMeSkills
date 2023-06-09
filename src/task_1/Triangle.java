package task_1;

import task_1.Abstractions.Figure;

public class Triangle extends Figure {
    // FIELDS
    private double _sideA;
    private double _sideB;
    private double _sideC;

    // CONSTRUCTORS
    public Triangle(String name, double _sideA, double _sideB, double _sideC) {
        super(name);
        this._sideA = _sideA;
        this._sideB = _sideB;
        this._sideC = _sideC;
    }

    // GETTERS AND SETTERS
    public double GetSideA() {
        return _sideA;
    }
    public void SetSideA(double newSideA) {
        _sideA = newSideA;
    }

    public double GetSideB() {
        return _sideB;
    }
    public void SetSideB(double newSideB) {
        _sideB = newSideB;
    }

    public double GetSideC() {
        return _sideC;
    }
    public void SetSideC(double newSideC) {
        _sideC = newSideC;
    }

    // METHODS
    @Override
    public double GetSquare() {
        double halfArea = _getHalfArea();

        return Math.sqrt(halfArea * (halfArea - _sideA) * (halfArea - _sideB) * (halfArea - _sideC));
    }

    @Override
    public double GetArea() {
        return _sideA + _sideB + _sideC;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(
                "SideA: " + _sideA
                + " SideB: " + _sideB
                + " SideC: " + _sideC
        );
    }

    private double _getHalfArea() {
        return (_sideA + _sideB + _sideC) / 2;
    }
}
