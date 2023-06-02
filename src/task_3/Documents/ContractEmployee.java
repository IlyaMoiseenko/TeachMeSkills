package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractEmployee extends Document {
    private Date _endDate;
    private String _nameOfEmployee;

    public ContractEmployee() {}
    public ContractEmployee(int _numberOfDocument, String _dateOfDocument, String _endDate, String _nameOfEmployee) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        this._endDate = simpleDateFormat.parse(_endDate);
        this._nameOfEmployee = _nameOfEmployee;
    }

    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "End date: " + _endDate
                + " Name of employee: " + _nameOfEmployee
        );
    }
}
