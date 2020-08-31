package com.company;

public class Dog extends Animal{
    int leg;
    int brain;
    int tale;
    int eyes;

    public Dog(String name, int size, int weight) {
        super(name, size, weight);
        this.leg = 4;
        this.brain = 1;
        this.tale = 1;
        this.eyes = 2;
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Dog.eat");
    }

    @Override
    public void move(double speed) {
        super.move(10);
        System.out.println("Dog running 10mph");
    }
}
