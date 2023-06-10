package task_1;

import java.util.Random;

public class Vector2d {
    // FIELDS
    private double _x, _y;
    private final String information;

    // CONSTRUCTORS
    public Vector2d(double x, double y) {
        _x = x;
        _y = y;

        information = "Это вектор для двумерной системы координат";
    }

    // GETTERS AND SETTERS
    public double GetX() {
        return _x;
    }
    public void SetX(double newX) {
        _x = newX;
    }

    public double GetY() {
        return _y;
    }
    public void SetY(double newY) {
        _y = newY;
    }

    // METHODS
    public double GetLength() {
        return Math.sqrt(Math.pow(_x, 2) + Math.pow(_y, 2));
    }

    public Vector2d Scalar(Vector2d vector2d) {
        return new Vector2d(this._x * vector2d._x, this._y * vector2d._y);
    }

    public Vector2d Sum(Vector2d vector2d) {
        return new Vector2d(this._x + vector2d._x, this._y + vector2d._y);
    }

    public Vector2d Subtractions(Vector2d vector2d) {
        return new Vector2d(this._x - vector2d._x, this._y - vector2d._y);
    }

    public static Vector2d[] CreateArrayOfVector(int size) {
        Vector2d[] array = new Vector2d[size];

        for (int i = 0; i < array.length; i++)
            array[i] = new Vector2d(_getRandomNum(), _getRandomNum());

        return array;
    }

    @Override
    public String toString() {
        return information + "\nX: " + this._x + "\nY: " + this._y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Vector2d)) {
            return false;
        }
        Vector2d vector = (Vector2d) o;
        return this._x == vector._x && this._y == vector._y;
    }

    private static double _getRandomNum() {
        Random rnd = new Random();

        return rnd.nextDouble() * 10;
    }
}
