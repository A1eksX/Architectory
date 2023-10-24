package architectoryHW10;

import architectoryHW10.repository.ProductRepository;

/*
Создайте сервисный слой ProductService, который будет использовать репозиторий для выполнения операций с продуктами.
Добавьте бизнес-логику в сервисе (например, проверку цены продукта).
Сервис должен быть абстрагирован от сложностей доступа к данным и предоставлять интерфейс для работы с продуктами.
 */
public class ProductService {
    private ProductRepository productRepository;
    public void checkPrice(Product name){
        if (name.getPrice() <= 0){
            System.out.println("Стоимость должна быть больше нуля");
        }
    }
    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            productRepository.checkAdd(product);
        }
    }

}
