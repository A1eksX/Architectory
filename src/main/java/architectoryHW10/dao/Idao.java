package architectoryHW10.dao;

import architectoryHW10.Product;

import java.util.List;

public interface Idao {
    void addProduct(Product product);
    Product findById(int id);
    List<Product> getAll();
    void deleteProduct(int id);
}
