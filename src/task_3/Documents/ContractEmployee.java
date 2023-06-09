package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractEmployee extends Document {
    // FIELDS
    private Date _endDate;
    private String _nameOfEmployee;

    // CONSTRUCTORS
    public ContractEmployee() {}
    public ContractEmployee(int _numberOfDocument, String _dateOfDocument, String _endDate, String _nameOfEmployee) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        this._endDate = simpleDateFormat.parse(_endDate);
        this._nameOfEmployee = _nameOfEmployee;
    }

    // GETTERS AND SETTERS
    public Date GetEndDate() {
        return _endDate;
    }
    public void SetEndData(Date newDate) {
        _endDate = newDate;
    }

    public String GetName() {
        return _nameOfEmployee;
    }
    public void SetName(String newName) {
        _nameOfEmployee = newName;
    }

    // METHODS
    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "End date: " + _endDate
                + " Name of employee: " + _nameOfEmployee
        );
    }
}
