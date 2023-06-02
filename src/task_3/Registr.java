package task_3;

import task_3.Abstractions.Document;
import task_3.Interfaces.ICrudDocument;

public class Registr implements ICrudDocument {
    private Document[] _documents = new Document[10];
    private int _indexForSaveDocuments = 0;

    public boolean Create(Document document) {
        if (_indexForSaveDocuments != _documents.length) {
            _documents[_indexForSaveDocuments] = document;

            return true;
        }

        return false;
    }

    @Override
    public void Read(Document document) {
        document.PrintInformation();
    }
}
