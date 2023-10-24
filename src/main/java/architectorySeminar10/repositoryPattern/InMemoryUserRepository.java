package architectorySeminar10.repositoryPattern;

import java.util.List;

import java.util.ArrayList;

public class InMemoryUserRepository implements Repository<Product> {
    private List<Product> users = new ArrayList<>();
    private int nextId = 1;

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