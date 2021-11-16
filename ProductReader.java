package dty.db;

import dty.business.Product;

public interface ProductReader {
    Product getProduct(String code);
    String getProducts();
}
