package architectorySeminar10.ServiceLayerPattern;

import java.util.List;

public class Main {
    // Service Layer Pattern

    /**
     * Включает в себя создание сервисного слоя в приложении, который абстрагирует бизнес-логику (доступ к данным)
     *предназначен для разделения бизнес-логики от слоя доступа к данным, т.е. он предоставляет интерфейс для выполнения
     * бизнес-операций и абстрагирует детали доступа к данным.
     * Главная цель - организация бизнес-логики связанной с продуктами, т.е. он проверяет какие-то бизнес-правила
     * @param args
     */
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "");

        // Добавляем продукты с бизнес-логикой через сервисный слой
        productService.addProductWithLogic(product1);
        productService.addProductWithLogic(product2);

        // Получаем все продукты через сервисный слой
        List<Product> products = productService.getAllProducts();

        System.out.println("All Products: " + products);
    }
}