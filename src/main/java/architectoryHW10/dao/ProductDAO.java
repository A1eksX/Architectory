package architectoryHW10.dao;

import architectoryHW10.Product;
import architectoryHW10.dao.Idao;

import java.util.ArrayList;
import java.util.List;
/*
Создание Data Access Object (DAO) для продуктов:
Создайте класс ProductDAO, который будет содержать методы для добавления, удаления и получения продуктов из базы данных (или списка).
Используйте этот класс для взаимодействия с данными о продуктах.
 */
public class ProductDAO implements Idao {
    private Product product;
    private List<Product> productList = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void addProduct(Product product){
        product.setId(nextId++);
        productList.add(product);
    }
    @Override
    public Product findById(int id){
        for (Product item: productList) {
            if (item.getId() == id){
                return item;
            }
        }
       return null;
    }
    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void deleteProduct(int id){
        for (Product item: productList) {
            if (item.getId() == product.getId()){
                productList.remove(item);
            }
        }
    }
}
