package task_3;

public class CashMachine {
    private double _numberBanknotesWithValue20;
    private double _numberBanknotesWithValue50;
    private double _numberBanknotesWithValue100;

    public CashMachine(double _numberBanknotesWithValue20, double _numberBanknotesWithValue50, double _numberBanknotesWithValue100) {
        this._numberBanknotesWithValue20 = _numberBanknotesWithValue20;
        this._numberBanknotesWithValue50 = _numberBanknotesWithValue50;
        this._numberBanknotesWithValue100 = _numberBanknotesWithValue100;
    }

    /*
    I can't do this part of the task
    "When withdrawing money, the function should print out how many bills of what denomination
    the amount is issued." I know how this can be implemented using an array,
    but according to the assignment, the nominal value must be stored in the fields.
    */

    public boolean WithdrawMoney(double amount) {
        if (amount %  10 != 0) return false;

        if ((_numberBanknotesWithValue100 * 100) +
                (_numberBanknotesWithValue50 * 50) +
                (_numberBanknotesWithValue20 * 20) >= amount) {
            return true;
        } else return false;
    }
}
