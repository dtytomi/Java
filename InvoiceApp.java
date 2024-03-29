package dty.ui;

import dty.db.ProductDB;
import dty.business.Invoice;
import dty.business.LineItem;
import dty.business.Product;

public class InvoiceApp {

    public static void main(String[] args) {
        
        // display a welcome message
        System.out.println("Welcome to the Invoice application");
        System.out.println();
        
        Invoice invoice = new Invoice();
        getLineItems(invoice);
        displayInvoice(invoice);

    }
    
    public static void getLineItems(Invoice invoice) {

        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            String productCode = Console.getString("Enter product code: ");
            int quantity = Console.getInt("Enter quantity:      ");
            
            Product product = ProductDB.getProduct(productCode);
            invoice.addItem(new LineItem(product, quantity));
            
            choice = Console.getString("Another line item (y/n):    ");
            System.out.println();
        }

    }

    public static void displayInvoice(Invoice invoice) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtil.pad("Description", 34));
        sb.append(StringUtil.pad("Price", 10));
        sb.append(StringUtil.pad("Qty", 5));
        sb.append(StringUtil.pad("Total", 10));
        sb.append("\n");

        for (LineItem lineItem: invoice.getLineItems()) {
            Product product = lineItem.getProduct();
            sb.append(StringUtil.pad(product.getDescription(), 34));
            sb.append(StringUtil.pad(product.getPriceFormatted(), 10));
            sb.append(StringUtil.pad(lineItem.getQuantityFormatted(), 5));
            sb.append(StringUtil.pad(lineItem.getTotalFormatted(), 10));
            sb.append("\n");
        }
        
        sb.append("\nInvoice total: ");
        sb.append(invoice.getTotalFormatted());
        sb.append("\n");
        System.out.println(sb);
    }

}
