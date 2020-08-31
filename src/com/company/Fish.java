package com.company;

public class Fish extends Animal{
    int gills;
    int fin;
    int eyes;

    @Override
    public void move(double speed) {
        super.move(speed);
        System.out.println("Fish swim");
    }
}
