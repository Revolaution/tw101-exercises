package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster{
    private String name;
    private Integer hitPoints;

    public Orc(){
        this.name = "Orc";
        this.hitPoints = 20;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + ", Hitpoints: " + hitPoints);
    }

    @Override
    public void takeDamage(int amount) {
        this.hitPoints -= 10;
    }
}
