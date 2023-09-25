package ArchitectoryHW2.prototype;

public class Main {
    public static void main(String[] args) {
        Human azor = new Human("Вальдемар");
        Human roza = (Human) azor.clone();
        System.out.println(roza);
        System.out.println(azor);
    }
}
