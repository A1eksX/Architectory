package ArchitectoryHW3.DIP;

// В данном примере используется принцип SOLID - Dependency Inversion Principle (Принцип инверсии зависимостей)
public class Main {
    public static void main(String[] args) {

        Pot pot = new Pot(new Milk("Milk"));
        Pot pot1 = new Pot(new Beer("beer"));
        Pot pot2 = new Pot(new Compote("Compote"));

        System.out.println(pot);
        System.out.println(pot1);
        System.out.println(pot2);
    }
}
