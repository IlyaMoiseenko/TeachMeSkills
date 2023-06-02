package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;

public class FinancialInvoice extends Document {
    private double _totalAmountForTheMonth;
    private int _departmentCode;

    public FinancialInvoice() {}
    public FinancialInvoice(int _numberOfDocument, String _dateOfDocument, double _totalAmountForTheMonth, int _departmentCode) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);
        this._totalAmountForTheMonth = _totalAmountForTheMonth;
        this._departmentCode = _departmentCode;
    }

    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "Total amount: " + _totalAmountForTheMonth
                + " Department code: " + _departmentCode
        );
    }
}
