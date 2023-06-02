package task_1;

import task_1.Abstractions.Figure;

public class Circle extends Figure {
    private double _radius;

    public Circle(String name, double _radius) {
        super(name);
        this._radius = _radius;
    }

    @Override
    public double GetSquare() {
        return Math.PI * Math.pow(_radius, 2);
    }

    @Override
    public double GetArea() {
        return 2 * Math.PI * _radius;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Radius: " + _radius);
    }
}
