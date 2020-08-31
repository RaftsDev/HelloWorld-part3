package com.company;

public class Fish extends Animal{
    int gills;
    int fins;
    int eyes;

    public Fish(String name, int size, int weight) {
        super(name, size, weight);
        this.gills = 2;
        this.fins = 3;
        this.eyes = 2;
    }

    @Override
    public void move(double speed) {
        super.move(speed);
        System.out.println("Fish swim");
    }
}
