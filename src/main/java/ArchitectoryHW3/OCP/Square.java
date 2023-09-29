package ArchitectoryHW3.OCP;

public class Square  implements Shape {
    /**
     * Данный клас определяет конкретный тип фигуры, имеет возможность переопределять метод расчёта
     * площади для данной фигуры за счёт имплементации интерфейса
     */
    private int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}