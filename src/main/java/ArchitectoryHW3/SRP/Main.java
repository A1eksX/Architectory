package ArchitectoryHW3.SRP;

// В данном примере используется принцип SOLID - Single Responsibility Principle (Принцип единственной ответственности),
// где каждый метод реализован отдельным классом
public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(new Point(1,1), side);
        // создаём объект для отрисовки
        SquareDraw squareDraw = new SquareDraw(side);
        //рисуем квадрат
        squareDraw.draw();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());

        // увеличиваем квадрат в 2 раза
        squareDraw.setSide(square.getSide()*2);
        // рисуем квадрат
        squareDraw.draw();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
    }
}