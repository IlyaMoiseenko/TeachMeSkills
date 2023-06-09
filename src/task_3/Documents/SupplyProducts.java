package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;

public class SupplyProducts extends Document {
    // FIELDS
    private String _typeOfGoods;
    private int _numberOfProducts;

    // CONSTRUCTORS
    public SupplyProducts() {}
    public SupplyProducts(int _numberOfDocument, String _dateOfDocument, String _typeOfGoods, int _numberOfProducts) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);

        this._typeOfGoods = _typeOfGoods;
        this._numberOfProducts = _numberOfProducts;
    }

    // GETTERS AND SETTERS
    public String GetTypeOfGoods() {
        return _typeOfGoods;
    }
    public void SetTypeOfGoods(String newType) {
        _typeOfGoods = newType;
    }

    public int GetNumberOfProducts() {
        return _numberOfProducts;
    }
    public void SetNumberOfProducts(int newNumber) {
        _numberOfProducts = newNumber;
    }

    // METHODS
    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "Type: " + _typeOfGoods
                + " Number of products: " + _numberOfProducts
        );
    }
}
