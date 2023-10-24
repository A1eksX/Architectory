package architectorySeminar10.ServiceLayerPattern;

import java.util.List;

// Пример сервисного слоя для бизнес-логики
public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) { // бизнес-правило  -  не пустое ли имя???
            productRepository.addProduct(product);
        }
    }

    // Метод для получения всех продуктов через репозиторий
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}