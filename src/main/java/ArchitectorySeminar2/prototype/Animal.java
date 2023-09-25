package ArchitectorySeminar2.prototype;
/*
Позволяет создать новые объекты, на основе уже существующих объектов путём их клонирования.
Этот паттерн полезен, когда создание объекта обладает какими-то накладными расходами и необходимо избежать этих расходов
Для этого копируем существующий объект.
 */
// Абстрактный класс Прототипа
abstract class Animal  implements Cloneable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // Абстрактный метод клонирования
    public abstract Animal clone();
}

// Конкретный класс животного (Прототип)
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    // Реализация метода клонирования для собаки
    @Override
    public Animal clone() {
        return new Dog(this.getName());
    }
}
// Конкретный класс животного (Прототип)
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    // Реализация метода клонирования для кошки
    @Override
    public Animal clone() {
        return new Cat(this.getName());
    }

}