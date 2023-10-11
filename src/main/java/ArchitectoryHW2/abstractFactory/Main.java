package ArchitectoryHW2.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory euroFactory = new AnimalEuroFactory();
        EuroBeer bear = (EuroBeer) euroFactory.createBear();
        EuroPony pony = (EuroPony) euroFactory.createPony();
        bear.size();
        bear.roar();
        pony.igogo();
        pony.size();

        System.out.println("==========================");
        AnimalFactory asianFactory = new AnimalAsianFactory();
        AsianBeer asBear = (AsianBeer) asianFactory.createBear();
        AsianPony asPony = (AsianPony) asianFactory.createPony();

        asBear.roar();
        asBear.size();
        asPony.igogo();
        asPony.size();
    }
}
