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
private void swalow(){
    System.out.println("fish swalow");
}

    @Override
    public void eat() {
        System.out.println("fish eat");
        super.eat();
        this.swalow();
    }

    @Override
    public void move(double speed) {
        super.move(speed);
        System.out.println("Fish swim");
    }

}
