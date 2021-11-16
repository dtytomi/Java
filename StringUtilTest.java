package dty.ui;

import dty.db.ProductDB;
import dty.business.Product;

public class StringUtilTest {
    
    public static void main(String args[]) {
        
        System.out.println("Welcome to the Product Lister\n");

        final int CODE_WIDTH = 10;
        final int DESC_WIDTH = 34;
        fianl int PRICE_WIDTH = 10;

        // set up display string
        StringBuilder list = new StringBuilder();
        list.append(StringUtil.pad("Code", CODE_WIDTH));
        list.append(StringUtil.pad("Description", DESC_WIDTH));
        list.append(StringUtil.pad("Price", PRICE_WIDTH));
        list.append("\n");

        list.append(
                StringUtil.pad("=========", CODE_WIDTH));
        list.append(
                StringUtil.pad("===================================", CODE_WIDTH));
        list.append(
                StringUtil.pad("=========", PRICE_WIDTH));
        list.append("\n");
        
        // perform 1 or more calculations
        String choice = "y";

        while (choice.equalIgnoreCase("y")) {
            
            // get the input from the user
            String productCode = Console.getString("Enter product code: ");

            Product product = ProductDB.getProduct(productCode);
            
            list.append(
                StringUtil.pad(product.getCode(), CODE_WIDTH));
            list.append(
                StringUtil.pad(product.getDescription(), CODE_WIDTH));
            list.append(
                StringUtil.pad(product.getPriceFormatted(), PRICE_WIDTH));
            list.append("\n");
            
            // see if the user wants to continue
            choice = Console.getString("Another product? (y/n): ");
            System.out.println();
        }

        System.out.println(list);
    }
}
