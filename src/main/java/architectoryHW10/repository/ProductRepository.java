package architectoryHW10.repository;

import architectoryHW10.Product;
import architectoryHW10.dao.ProductDAO;
import architectoryHW10.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

/*
    Создайте класс ProductRepository, который будет служить репозиторием для продуктов.
    Он должен использовать DAO для доступа к данным.
    Репозиторий должен иметь методы для добавления, удаления и получения продуктов.
    Он также должен содержать логику, связанную с продуктами (например, проверку на корректность данных).
 */
public class ProductRepository implements IRepository<Product> {
    private ProductDAO dao;
    private List<Product> users = new ArrayList<>();
    private int nextId = 1;
    @Override
    public void checkDelete(architectoryHW10.Product product){
        for (architectoryHW10.Product item: dao.getAll() ) {
            if (item.getName().equalsIgnoreCase(product.getName())){
                dao.deleteProduct(item.getId());
            }
        }
    }

    @Override
    public void checkAdd(architectoryHW10.Product product){
        if (product.getName() != null && !product.getName().isEmpty()){
            dao.addProduct(product);
        }
    }


    @Override
    public Product getById(int id) {
        for (Product user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void add(Product user) {
        user.setId(nextId++);
        users.add(user);
    }

    @Override
    public void update(Product user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
