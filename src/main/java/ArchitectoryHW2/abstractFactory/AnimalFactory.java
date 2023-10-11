package ArchitectoryHW2.abstractFactory;

public interface AnimalFactory {
    Bear createBear();
    Pony createPony();
}
class Bear {
    public void roar (){
        System.out.println("ppPPPP");
    }
}
class Pony {
    public void igogo(){
        System.out.println("igogo");
    }
}
class EuroBeer extends Bear{
    public void size(){
        System.out.println("big");
    }
}
class AsianBeer extends Bear {
    public void size(){
        System.out.println("little");
    }
}
class EuroPony extends Pony {
    public void size (){
        System.out.println("big");
    }
}
class AsianPony extends Pony {
    public void size(){
        System.out.println("little");
    }
}
class AnimalEuroFactory implements AnimalFactory{

    @Override
    public Bear createBear() {
        return new EuroBeer();
    }

    @Override
    public Pony createPony() {
        return new EuroPony();
    }
}
class AnimalAsianFactory implements AnimalFactory {

    @Override
    public Bear createBear() {
        return new AsianBeer();
    }

    @Override
    public Pony createPony() {
        return new AsianPony();
    }
}

