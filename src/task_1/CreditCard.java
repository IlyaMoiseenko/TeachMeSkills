package task_1;

public class CreditCard {
    // FIELDS
    private double _accountNumber;
    private double _currentAmount;

    // CONSTRUCTORS
    public CreditCard(double currentAmount) {
        _currentAmount = currentAmount;
        _accountNumber = Math.random();
    }

    // GETTERS AND SETTERS
    public double GetAmount() {
        return _currentAmount;
    }
    public void SetAmount(double newAmount) {
        if (newAmount > 0) _currentAmount = newAmount;
    }

    public double GetAccountNumber() {
        return _accountNumber;
    }

    // METHODS
    public void AddAmount(double amount) {
        if (_checkNegativeAmount(amount)) System.out.println("negative value");
        else _currentAmount += amount;
    }

    public void WithdrawMoney(double amount) {
        if (_checkNegativeAmount(amount)) System.out.println("negative value");

        if (_currentAmount - amount <= 0 || amount > _currentAmount) System.out.println("insufficient funds to withdraw");
        else _currentAmount -= amount;
    }

    private boolean _checkNegativeAmount(double amount) {
        return amount < 0;
    }

    @Override
    public String toString() {
        return "Account number: " + this._accountNumber + " Current amount: " + this._currentAmount;
    }
}
