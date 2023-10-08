package architectoryHW6.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создаём фабрику
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        // создаём список где будем хранить КАЖДЫЙ вызов животных
        List<IAnimal> lst = new ArrayList<>();
        lst.add(factoryAnimal.getAnimal("Dog"));
        lst.add(factoryAnimal.getAnimal("Cat"));
        lst.add(factoryAnimal.getAnimal("Dog"));
        lst.add(factoryAnimal.getAnimal("Cat"));
        lst.add(factoryAnimal.getAnimal("Dog"));
        lst.add(factoryAnimal.getAnimal("Cat"));
        lst.add(factoryAnimal.getAnimal("qqq"));
        lst.add(factoryAnimal.getAnimal("Cat"));
        lst.add(factoryAnimal.getAnimal("Cat"));
        try {
            for (IAnimal unit : lst) {
                unit.zoo();
            }
        }catch(NullPointerException e){
            System.out.println("таких животных нет ");
        }
    }
}