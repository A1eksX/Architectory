package ArchitectoryHW3.LSP_ISP;

// В данном примере используется принцип SOLID - Interface Segregation Principle (Принцип разделения интерфейса),
//                                      а так же Liskov Substitution Principle (Принцип подстановки Барбары Лисков).
public class Main {
    public static void main(String[] args) {
        // создаём объекты классов
        Animal cat = new Cat("Мяука");
        Animal crow = new Сrow("Хугин");
        Animal anaconda = new Anaconda("Обнимашка");

        // создаём список животных
        AnimalWorld world = new AnimalWorld();
        world.addAnimal(cat)
             .addAnimal(crow)
             .addAnimal(anaconda);

        System.out.println(cat.moving());
        System.out.println(crow.moving());
        System.out.println(anaconda.moving());

        System.out.println("<<<<<<<Sound>>>>>>>>>");

        for (Soundable unit: world.soundable()) {
            System.out.println(unit.getSound());
        }
        System.out.println("<<<<<<<SpeedMovings>>>>>>>>>");

        for (SpeedMoving unit1: world.speedMovings()) {
            System.out.println(unit1.getSpeedMooving());
        }

    }
}