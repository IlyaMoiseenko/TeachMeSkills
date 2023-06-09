package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;

public class FinancialInvoice extends Document {
    // FIELDS
    private double _totalAmountForTheMonth;
    private int _departmentCode;

    // CONSTRUCTORS
    public FinancialInvoice() {}
    public FinancialInvoice(int _numberOfDocument, String _dateOfDocument, double _totalAmountForTheMonth, int _departmentCode) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);
        this._totalAmountForTheMonth = _totalAmountForTheMonth;
        this._departmentCode = _departmentCode;
    }

    // GETTERS AND SETTERS
    public double GetTotalAmount() {
        return _totalAmountForTheMonth;
    }
    public void SetTotalAmount(double newAmount) {
        _totalAmountForTheMonth = newAmount;
    }

    public int GetDepartmentCode() {
        return _departmentCode;
    }
    public void SetDepartmentCode(int newCode) {
        _departmentCode = newCode;
    }

    // METHODS
    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "Total amount: " + _totalAmountForTheMonth
                + " Department code: " + _departmentCode
        );
    }
}
