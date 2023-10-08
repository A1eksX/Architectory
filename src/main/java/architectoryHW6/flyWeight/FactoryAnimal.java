package architectoryHW6.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class FactoryAnimal {
    // создаём коллекцию
    private Map<String, IAnimal> map = new HashMap<>();

    // создаём метод, который будет возвращать животное если оно есть, если его нет, то оно будет
    // создано, добавлено в коллекцию и вернётся
    IAnimal getAnimal(String animal) {
        // получаем животное из коллекции по ключу -animal-
        IAnimal animal1 = map.get(animal);
        // проверяем, получили животное или нет, если по данному ключу -animal- ничего нет, то...
        if (animal1 == null) {
            // добавляем искомое животное в коллекцию, для этого...
            // смотрим какое животное добавляют -animal-...
            switch (animal) {
                // если -animal- соответствует -"Dog"-
                case "Dog":
                    // выводим сообщение о создании -Dog-
                    System.out.println("Create Dog");
                    // создаём -Dog-
                    animal1 = new Dog();
                    break;
                // если -animal- соответствует -"Cat"-
                case "Cat":
                    // выводим сообщение о создании -Cat-
                    System.out.println("Create Cat");
                    // создаём -Cat-
                    animal1 = new Cat();
                    break;
            }
            // добавляем созданное животное в коллекцию
            map.put(animal, animal1);
        }
        return animal1;
    }


}
