package com.company;

public class Fish extends Animal{
    int gills;
    int fins;
    int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
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
