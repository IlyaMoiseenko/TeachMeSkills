package task_1;

import task_1.Abstractions.Figure;

public class Circle extends Figure {
    // FIELDS
    private double _radius;

    // CONSTRUCTORS
    public Circle(String name, double _radius) {
        super(name);
        this._radius = _radius;
    }

    // GETTERS AND SETTERS
    public double GetRadius() {
        return _radius;
    }
    public void SetRadius(double newRadius) {
        _radius = newRadius;
    }

    // METHODS
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
