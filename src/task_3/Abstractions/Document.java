package task_3.Abstractions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Document {
    protected int _numberOfDocument;
    protected Date _dateOfDocument;

    public Document() {}
    public Document(int _numberOfDocument, String _dateOfDocument) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        this._numberOfDocument = _numberOfDocument;
        this._dateOfDocument = simpleDateFormat.parse(_dateOfDocument);
    }

    public void PrintInformation() {
        System.out.println(
                "Number: " + _numberOfDocument
                + " Date: " + _dateOfDocument
        );
    }
}
