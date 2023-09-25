package ArchitectoryHW2.builder;

public class Animal {
    private String head; //голова
    private String paws; //лапы
    private String tail; //хвост
    private String wings; // крылья
    private String bodyСover; // покров тела
    private String beak; // клюв

    public Animal(String head, String paws, String tail, String wings, String bodyСover, String beak) {
        this.head = head;
        this.paws = paws;
        this.tail = tail;
        this.wings = wings;
        this.bodyСover = bodyСover;

        this.beak = beak;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s", head, paws, tail, wings, bodyСover, beak);
//                "Monkey{" +
//                "head='" + head + '\'' +
//                ", paws='" + paws + '\'' +
//                ", tail='" + tail + '\'' +
//                '}';
    }
}
