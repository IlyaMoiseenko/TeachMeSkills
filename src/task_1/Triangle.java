package task_1;

import task_1.Abstractions.Figure;

public class Triangle extends Figure {
    private double _sideA;
    private double _sideB;
    private double _sideC;

    public Triangle(String name, double _sideA, double _sideB, double _sideC) {
        super(name);
        this._sideA = _sideA;
        this._sideB = _sideB;
        this._sideC = _sideC;
    }

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
