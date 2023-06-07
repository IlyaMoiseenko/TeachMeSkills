package task_3;

public class CashMachine {
    // FIELDS
    private double _numberBanknotesWithValue20;
    private double _numberBanknotesWithValue50;
    private double _numberBanknotesWithValue100;

    // CONSTRUCTORS
    public CashMachine(double _numberBanknotesWithValue20, double _numberBanknotesWithValue50, double _numberBanknotesWithValue100) {
        this._numberBanknotesWithValue20 = _numberBanknotesWithValue20;
        this._numberBanknotesWithValue50 = _numberBanknotesWithValue50;
        this._numberBanknotesWithValue100 = _numberBanknotesWithValue100;
    }

    // GETTERS AND SETTERS
    public double GetNumberBanknotesWithValue20() {
        return _numberBanknotesWithValue20;
    }
    public void SetNumberBanknotesWithValue20(double newValue) {
        _numberBanknotesWithValue20 = newValue;
    }

    public double GetNumberBanknotesWithValue50() {
        return _numberBanknotesWithValue50;
    }
    public void SetNumberBanknotesWithValue50(double newValue) {
        _numberBanknotesWithValue50 = newValue;
    }

    public double GetNumberBanknotesWithValue100() {
        return _numberBanknotesWithValue100;
    }
    public void SetNumberBanknotesWithValue100(double newValue) {
        _numberBanknotesWithValue100 = newValue;
    }

    /*
    I can't do this part of the task
    "When withdrawing money, the function should print out how many bills of what denomination
    the amount is issued." I know how this can be implemented using an array,
    but according to the assignment, the nominal value must be stored in the fields.
    */

    // METHODS
    public boolean WithdrawMoney(double amount) {
        if (amount %  10 != 0) return false;

        if ((_numberBanknotesWithValue100 * 100) +
                (_numberBanknotesWithValue50 * 50) +
                (_numberBanknotesWithValue20 * 20) >= amount) {
            return true;
        } else return false;
    }
}
