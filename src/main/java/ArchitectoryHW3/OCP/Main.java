package ArchitectoryHW3.OCP;

import java.util.ArrayList;
import java.util.List;

// В данном примере используется принцип SOLID - Open-Closed Principle (Принцип открытости-закрытости)
public class Main {
    /**
     * метод Main связывается с методами Square и RightTriangle через интерфейс Shape в котором указан метод area.
     * Метод area - реализуется каждым методом (Square и RightTriangle) отдельно возвращая при этом один и тот же тип
     * т.о. используя интерфейс можно расширить возможности расчёта площади различных фигур.
     * @param args
     */
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;

        for (Shape shape : shapes) {
            sumArea += shape.area();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}