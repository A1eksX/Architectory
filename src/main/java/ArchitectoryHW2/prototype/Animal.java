package ArchitectoryHW2.prototype;

abstract class Animal implements Cloneable{
    private String name;

    public Animal(String name) {    //конструктор
        this.name = name;
    }

    public String getName() {   // геттер для получения имени
        return name;
    }
    public abstract Animal clone();
}
class Human extends Animal{
    public Human(String name) {
        super(name);
    }

    @Override
    public Animal clone() {
        return new Human(this.getName());
    }
}