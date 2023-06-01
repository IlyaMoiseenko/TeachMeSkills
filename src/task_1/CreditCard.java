package task_1;

import java.math.BigDecimal;

public class CreditCard {
    private double _accountNumber;
    private double _currentAmount;

    public CreditCard(double currentAmount) {
        _currentAmount = currentAmount;
        _accountNumber = Math.random();
    }

    public void AddAmount(double amount) {
        if (_checkAmount(amount)) System.out.println("negative value");
        else _currentAmount += amount;
    }

    public void WithdrawMoney(double amount) {
        if (_checkAmount(amount)) System.out.println("negative value");

        if (_currentAmount - amount == 0) System.out.println("insufficient funds to withdraw");
        else _currentAmount -= amount;
    }

    private boolean _checkAmount(double amount) {
        if (amount < 0) return true;

        return false;
    }

    @Override
    public String toString() {
        return "Account number: " + this._accountNumber + " Current amount: " + this._currentAmount;
    }
}
