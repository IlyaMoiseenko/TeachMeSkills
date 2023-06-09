package task_3.Abstractions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Document {
    // FIELDS
    protected int _numberOfDocument;
    protected Date _dateOfDocument;

    // CONSTRUCTORS
    public Document() {}
    public Document(int _numberOfDocument, String _dateOfDocument) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        this._numberOfDocument = _numberOfDocument;
        this._dateOfDocument = simpleDateFormat.parse(_dateOfDocument);
    }

    // GETTERS AND SETTERS
    public int GetNumberOfDocument() {
        return _numberOfDocument;
    }
    public void SetNumberOfDocument(int newNumber) {
        _numberOfDocument = newNumber;
    }

    public Date GetDateOfDocument() {
        return _dateOfDocument;
    }
    public void SetDateOfDocument(Date newDate) {
        _dateOfDocument = newDate;
    }

    // METHODS
    public void PrintInformation() {
        System.out.println(
                "Number: " + _numberOfDocument
                + " Date: " + _dateOfDocument
        );
    }
}
