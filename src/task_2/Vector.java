package task_2;

import task_1.Vector2d;

import java.util.Arrays;
import java.util.Random;

public class Vector {
    // FIELDS
    private double[] _coordinates;
    private final String _information;

    // CONSTRUCTORS
    public Vector(double[] coordinates, String info) {
        _coordinates = coordinates;
        _information = info;
    }

    // GETTERS AND SETTERS
    public double[] GetCoordinates() {
        return _coordinates;
    }
    public void SetCoordinates(double[] newCoordinates) {
        _coordinates = newCoordinates;
    }

    public String GetInformation() {
        return _information;
    }

    // METHODS
    public double Length() {
        int sum = 0;

        for (double coordinate : _coordinates)
            sum += coordinate;

        return Math.sqrt(Math.pow(sum, 2));
    }

    public Vector Scalar(Vector vector) {
        if (this._coordinates.length != vector._coordinates.length)
            return this;

        double[] newCoordinates = new double[_coordinates.length];

        for (int i = 0; i < _coordinates.length; i++)
            newCoordinates[i] = this._coordinates[i] * vector._coordinates[i];


        return new Vector(newCoordinates, "New vector");
    }

    public Vector Sum(Vector vector) {
        if (this._coordinates.length != vector._coordinates.length)
            return this;

        double[] newCoordinates = new double[_coordinates.length];

        for (int i = 0; i < _coordinates.length; i++)
            newCoordinates[i] = this._coordinates[i] + vector._coordinates[i];


        return new Vector(newCoordinates, "New vector");
    }

    public Vector Subtractions(Vector vector) {
        if (this._coordinates.length != vector._coordinates.length)
            return this;

        double[] newCoordinates = new double[_coordinates.length];

        for (int i = 0; i < _coordinates.length; i++)
            newCoordinates[i] = this._coordinates[i] - vector._coordinates[i];


        return new Vector(newCoordinates, "New vector");
    }

    public static Vector[] CreateArrayOfVector(int size) {
        Vector[] array = new Vector[size];

        for (int i = 0; i < array.length; i++) {
            double[] newCoordinates = new double[3];

            for (int j = 0; j < newCoordinates.length; j++) {
                newCoordinates[j] = _getRandomNum();
            }

            array[i] = new Vector(newCoordinates, "New vector");
        }


        return array;
    }

    private static double _getRandomNum() {
        Random rnd = new Random();

        return rnd.nextDouble() * 10;
    }

    @Override
    public String toString() {
        return this._information + "\nCoordinates: " + Arrays.toString(this._coordinates);
    }

    @Override
    public boolean equals(Object o) {
        boolean key = true;

        if (this == o) {
            return true;
        } else if (!(o instanceof Vector)) {
            return false;
        }

        Vector vector = (Vector) o;
        for (int i = 0; i < this._coordinates.length; i++) {
            if (this._coordinates[i] != vector._coordinates[i])
                return !key;
        }


        return key;
    }
}
