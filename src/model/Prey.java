package model;

public class Prey {
    private String name;
    private int health;

    public Prey(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void getDamage(int value) {
        health -= value;
    }

    @Override
    public String toString() {
        return name;
    }
}
