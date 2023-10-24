package architectoryHW10;

public class Main {
    // Unit of Work Pattern

    /**
     * Этот паттерн предназначен для управления транзакциями и изменениями данных.
     * Он позволяет выполнять несколько операция в одну транзакцию, тем самым обеспечивая целостность данных
     * Все данные сохраняются ОДНОВРЕМЕННО при вызове метода commit()
     * @param args
     */

    /*
    В главной программе создайте несколько продуктов, добавьте их с помощью сервиса в рамках одной транзакции.
    Попробуйте отменить транзакцию (используя Unit of Work) и проверьте, что изменения не сохраняются.
    Затем завершите транзакцию и выведите список всех продуктов с их атрибутами на экран.
     */
    public static void main(String[] args) {
        UnitOfWork unitOfWork = new UnitOfWork();

        // создаём продукт
        Product product1 = new Product(1, "Laptop", 399.99);
        Product product2 = new Product(2, "Smartphone", 199.99);
        Product product3 = new Product(3, "fish", 1.99);

        // добавляем продукт
        unitOfWork.addNewProduct(product1);
        unitOfWork.addNewProduct(product2);
        unitOfWork.addNewProduct(product3);

        // Сохраняем все изменения (выполняем транзакцию)
        unitOfWork.commit();

        System.out.println("Products (after commit): " + unitOfWork.getAllProducts());
        System.out.println("===========================");

        // отменяем транзакцию
        unitOfWork.cancelOperations();
        // Сохраняем все изменения (выполняем транзакцию)
        unitOfWork.cancelOperations();
        System.out.println("Cancel transaction " + unitOfWork.getAllProducts());

        // добавляем продукт
        unitOfWork.addNewProduct(product1);
        unitOfWork.addNewProduct(product2);
        unitOfWork.addNewProduct(product3);
        // Сохраняем все изменения (выполняем транзакцию)
        unitOfWork.commit();
        System.out.println("Products (after commit): " + unitOfWork.getAllProducts());
    }
}
