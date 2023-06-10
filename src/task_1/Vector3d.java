package task_1;

import java.util.Random;

public class Vector3d {
    // FIELDS
    private double _x, _y, _z;
    private final String information;

    // CONSTRUCTORS
    public Vector3d(double x, double y, double z) {
        _x = x;
        _y = y;
        _z = z;

        information = "Это вектор для трехмерной системы координат";
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

    public double GetZ() {
        return _z;
    }
    public void SetZ(double newZ) {
        _z = newZ;
    }

    // METHODS
    public double GetLength() {
        return Math.sqrt(Math.pow(_x, 2) + Math.pow(_y, 2) + Math.pow(_z, 2));
    }

    public Vector3d Scalar(Vector3d vector3d) {
        return new Vector3d(this._x * vector3d._x, this._y * vector3d._y, this._z * vector3d._z);
    }

    public Vector3d Sum(Vector3d vector3d) {
        return new Vector3d(this._x + vector3d._x, this._y + vector3d._y, this._z + vector3d._z);
    }

    public Vector3d Subtractions(Vector3d vector3d) {
        return new Vector3d(this._x - vector3d._x, this._y - vector3d._y, this._z - vector3d._z);
    }

    public static Vector3d[] CreateArrayOfVector(int size) {
        Vector3d[] array = new Vector3d[size];

        for (int i = 0; i < array.length; i++)
            array[i] = new Vector3d(_getRandomNum(), _getRandomNum(), _getRandomNum());

        return array;
    }

    @Override
    public String toString() {
        return information + "\nX: " + this._x + "\nY: " + this._y + "\nZ: " + this._z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Vector3d)) {
            return false;
        }
        Vector3d vector = (Vector3d) o;
        return this._x == vector._x && this._y == vector._y && this._z == vector._z;
    }

    private static double _getRandomNum() {
        Random rnd = new Random();

        return rnd.nextDouble() * 10;
    }
}
