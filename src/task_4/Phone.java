package task_4;

import java.util.Arrays;

public class Phone {
    // FIELDS
    private String _number;
    private String _model;
    private double _weight;

    // CONSTRUCTORS
    public Phone() {};

    public Phone(String number, String model) {
        _number = number;
        _model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        _weight = weight;
    }

    // GETTERS AND SETTERS
    public String GetNumber() {
        return _number;
    }
    public void SetNumber(String newNumber) {
        _number = newNumber;
    }

    public String GetModel() {
        return _model;
    }
    public void SetModel(String newModel) {
        _model = newModel;
    }

    public double GetWeight() {
        return _weight;
    }
    public void SetWeight(double newWeight) {
        if (newWeight > 0) _weight = newWeight;
    }

    // METHODS
    public void ReceiveCall(String from) {
        System.out.println("Call " + from);
    }

    public void ReceiveCall(String from, String phoneNumber) {
        System.out.println(
                "Call " + from + "\n"
                + "Phone number: " + phoneNumber);
    }

    public void SendMessage(String ... phoneNumbers) {
        System.out.println(Arrays.toString(phoneNumbers));
    }
}
