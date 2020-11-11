package model;

import java.util.Random;

public class Predator extends Animal {
    private String name;
    final Random random = new Random();

    public Predator(String name) {
        this.name = name;
    }

    public void hunt(Prey prey) {
        int damage = random.nextInt(101);
        prey.getDamage(damage);
        System.out.println(name + " охотится на " + prey);
        System.out.println(name+ " нанес урон "+prey+": " + damage);
    }

    @Override
    public String toString() {
        return name;
    }
}
