package ArchitectoryHW3.LSP_ISP;

//     * Использование абстрактного класса Animal, позволяет возвращать общий(родительский) класс для всех остальных
//     * классов (Анаконда, Кот, Ворон...). Что позволяет соблюсти принцип SOLID -
//     * Liskov Substitution Principle (Принцип подстановки Барбары Лисков). Так же кроме абстрактного класса можно
//     * использовать интерфейсы.
//     */

/**
 * Абстрактный (общий) класс - родитель, для всех животных.
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    // абстрактный метод, реализуемый (перегруженный) в каждом дочернем классе
    public abstract String moving();

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
