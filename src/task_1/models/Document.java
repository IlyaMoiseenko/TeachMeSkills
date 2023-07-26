package task_1.models;

import java.util.Objects;

public class Document {
    private final String number;
    private boolean isValid;

    public Document(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", isValid=" + isValid +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Document document = (Document) obj;

        return document.number.equals(((Document) obj).number);
    }
}
