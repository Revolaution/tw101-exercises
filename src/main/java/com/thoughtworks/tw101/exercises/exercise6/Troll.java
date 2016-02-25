package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private String name;
    private Integer hitPoints;

    public Troll(){
        this.name = "Troll";
        this.hitPoints = 40;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + ", Hitpoints: " + hitPoints);
    }

    @Override
    public void takeDamage(int amount) {
        this.hitPoints -= (amount / 2);
    }
}
