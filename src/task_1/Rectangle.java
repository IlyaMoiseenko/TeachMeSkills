package task_1;

import task_1.Abstractions.Figure;

public class Rectangle extends Figure {
    // FIELDS
    private double _width;
    private double _height;

    // CONSTRUCTORS
    public Rectangle(String name, double _width, double _height) {
        super(name);
        this._width = _width;
        this._height = _height;
    }

    // GETTERS AND SETTERS
    public double GetWidth() {
        return _width;
    }
    public void SetWidth(double newWidth) {
        _width = newWidth;
    }

    public double GetHeight() {
        return _height;
    }
    public void SetHeight(double newHeight) {
        _height = newHeight;
    }

    // METHODS
    @Override
    public double GetSquare() {
        return _width * _height;
    }

    @Override
    public double GetArea() {
        return (_width + _height) * 2;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(
                "Width: " + _width
                + " Height: " + _height
        );
    }
}
