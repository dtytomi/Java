package dty.db;

import dty.business.Product;

public class ProductDBI implements ProductReader {
    
    @Override
    public Product getProduct(String productCode) {
        
        Product product = new Product();
        
        product.setCode(productCode);
        
        if (productCode.equalsIgnoreCase("java")) {
                product.setDescription("Murach's Java Programming");
                product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
                product.setDescription("Murach's Java Servlets and JSP");
                product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
                product.setDescription("Murach's MySQL");
                product.setPrice(57.50); 
        } else {
                product.setDescription("Unknown");
        }

        return product;
    }

    @Override
    public String getProducts() {
        return "This method hasn't been implemented yet.";
    }
}
