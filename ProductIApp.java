package dty.ui;

import java.util.Scanner;
import dty.db.ProductDBI;
import dty.db.ProductReader;
import dty.business.Product;

public class ProductIApp {
    
    public static void main(String args[]) {
        
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc =  new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code:   ");
            String productCode = sc.nextLine();     // read the product code

            // Use a ProductReader object to get the Product object
            ProductReader reader =  new ProductDBI();
            Product product = reader.getProduct(productCode);

            // display the output
            String message = "\nPRODUCT\n" + 
                "Code:          " + product.getCode() + "\n" +
                "Description:   " + product.getDescription() + "\n" +
                "Price:         " + product.getPriceFormatted() + "\n"; 
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }

}
