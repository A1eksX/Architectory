package architectorySeminar10.repositoryPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository<Product> userRepository = new InMemoryUserRepository();

        userRepository.add(new Product(1, "Alice"));
        userRepository.add(new Product(2, "Bob"));

        Product user = userRepository.getById(1);
        System.out.println("User with ID 1: " + user.getName());

        List<Product> allUsers = userRepository.getAll();
        System.out.println("All Users:");
        for (Product u : allUsers) {
            System.out.println(u.getId() + ": " + u.getName());
        }
        userRepository.update(new Product(1, "Alicia"));
        userRepository.delete(2);
    }
}