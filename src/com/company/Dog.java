package com.company;

public class Dog extends Animal{
    int leg;
    int brain;
    int tale;
    int eyes;

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
