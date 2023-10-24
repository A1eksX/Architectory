package architectoryHW10.repository;

import java.util.List;

public interface IRepository<E> {
    void checkDelete(E e);
    void checkAdd(E e);

    E getById(int id);
    List<E> getAll();
    void add(E e);
    void update(E e);
    void delete(int id);
}
