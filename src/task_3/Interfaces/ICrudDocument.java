package task_3.Interfaces;

import task_3.Abstractions.Document;

public interface ICrudDocument {
    boolean Create(Document document);
    void Read(Document document);
}
