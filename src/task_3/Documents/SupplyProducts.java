package task_3.Documents;

import task_3.Abstractions.Document;

import java.text.ParseException;

public class SupplyProducts extends Document {
    private String _typeOfGoods;
    private int _numberOfProducts;

    public SupplyProducts() {}
    public SupplyProducts(int _numberOfDocument, String _dateOfDocument, String _typeOfGoods, int _numberOfProducts) throws ParseException {
        super(_numberOfDocument, _dateOfDocument);

        this._typeOfGoods = _typeOfGoods;
        this._numberOfProducts = _numberOfProducts;
    }

    @Override
    public void PrintInformation() {
        super.PrintInformation();
        System.out.println(
                "Type: " + _typeOfGoods
                + " Number of products: " + _numberOfProducts
        );
    }
}
