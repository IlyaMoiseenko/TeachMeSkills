package task_3;

import task_3.Documents.ContractEmployee;
import task_3.Documents.FinancialInvoice;
import task_3.Documents.SupplyProducts;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Registr registr = new Registr();
        ContractEmployee contractEmployee = new ContractEmployee(
                1234,
                "22-05-2021",
                "22-05-2022",
                "Ilya"
        );

        SupplyProducts supplyProducts = new SupplyProducts(
                1234,
                "22-05-2021",
                "Type",
                55
        );

        FinancialInvoice financialInvoice = new FinancialInvoice(
                1234,
                "22-05-2021",
                1500,
                102
        );

        registr.Create(contractEmployee);
        registr.Create(supplyProducts);
        registr.Create(financialInvoice);

        registr.Read(contractEmployee);
        System.out.println("------");

        registr.Read(supplyProducts);
        System.out.println("------");

        registr.Read(financialInvoice);
        System.out.println("------");
    }
}
