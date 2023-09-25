package ArchitectoryHW2.builder;

public class Main {
    public static void main(String[] args) {
        Animal monkey = new AnimalBuilder()
                .setHead("Рыжая")
                .setPaws("4 штуки")
                .setTail("гибкий, длинный")
                .setBodyСover("короткий мех")
                .build();


        Animal bird = new AnimalBuilder()
                .setHead("Маленькая")
                .setPaws(" 2 штуки")
                .setWings("есть")
                .setBodyСover("Перья")
                .setBeak("Клюв")
                .build();

        System.out.println(monkey);
        System.out.println(bird);
    }


}
