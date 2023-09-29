package ArchitectoryHW3.OCP;

public class RightTriangle implements Shape {
    /**
     * Данный клас определяет конкретный тип фигуры, имеет возможность переопределять метод расчёта
     * площади для данной фигуры за счёт имплементации интерфейса
     */
    private int katet1;
    private int katet2;
    private double gipotenuza;

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }

    @Override
    public double area() {
        return katet1 * katet2 / 2.0;
    }
}