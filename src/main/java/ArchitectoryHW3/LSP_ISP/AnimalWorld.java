package ArchitectoryHW3.LSP_ISP;

import java.util.ArrayList;
import java.util.List;
/**
 * Через класс AnimalWorld происходит взаимодействие класса Main с остальной частью программы
 */
public class AnimalWorld {

    // создаём список животных
    private List<Animal> world = new ArrayList<>();
    // метод заполняет список животных
    public AnimalWorld addAnimal (Animal animal){
        world.add(animal);
        return this;
    }
    // метод soundable создаёт список животных издающие звуки
    public List<Soundable> soundable(){
        List<Soundable> soundables = new ArrayList<>();
        for (Animal unit:world) {
            if (unit instanceof Soundable){
                soundables.add((Soundable) unit);
            }
        }
        return soundables;
    }
    // метод speedMovings создаёт список животных умеющих передвигаться
    public List<SpeedMoving> speedMovings(){
        List<SpeedMoving>speedMovings = new ArrayList<>();
        for (Animal unit:world) {
            if (unit instanceof SpeedMoving){
                speedMovings.add((SpeedMoving) unit);
            }
        }
        return speedMovings;
    }

}
