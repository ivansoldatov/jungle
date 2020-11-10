package model;

public class Predator extends Animal {
    private String name;

    public Predator(String name) {
        this.name = name;
    }
    public void hunt(Prey prey) {
        System.out.println(name + " охотится на " + prey);
    }

    @Override
    public String toString() {
        return name;
    }
}
