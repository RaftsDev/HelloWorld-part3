package com.company;

public class Animal {
    String name;
    int size;
    int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eat");
    }

    public void move(double speed){
        System.out.println("Animal move in speed: "+speed);
    }
}

