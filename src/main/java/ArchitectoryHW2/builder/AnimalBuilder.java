package ArchitectoryHW2.builder;

public class AnimalBuilder {
    private String head;
    private String paws;
    private String tail;
    private String wings;
    private String bodyСover;
    private String beak;


    public AnimalBuilder setHead(String head) {
        this.head = head;
        return this;
    }

    public AnimalBuilder setPaws(String paws) {
        this.paws = paws;
        return this;
    }

    public AnimalBuilder setTail(String tail) {
        this.tail = tail;
        return this;
    }
    public AnimalBuilder setWings(String wings){
        this.wings = wings;
        return this;
    }

    public AnimalBuilder setBodyСover(String bodyСover) {
        this.bodyСover = bodyСover;
        return this;
    }


    public AnimalBuilder setBeak(String beak) {
        this.beak = beak;
        return this;
    }

    public Animal build(){
        return new Animal(head, paws, tail, wings, bodyСover, beak);
    }
}
