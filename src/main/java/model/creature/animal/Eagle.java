package model.creature.animal;

import model.creature.Animal;
import model.creature.Carnivorous;

import java.util.concurrent.ThreadLocalRandom;

public class Eagle implements Animal, Carnivorous {
    private final float MAX_WEIGHT;
    private final float SPEED;
    private final float MAX_SATIETY;
    private float currentWeight;
    private float currentSatiety;
    private final String GENDER = Math.random() <= 0.5 ? "male" : "female";

    public Eagle (float maxWeight, float speed, float maxSatiety) {
        MAX_WEIGHT = maxWeight;
        SPEED = speed;
        MAX_SATIETY = maxSatiety;
        this.currentWeight = ThreadLocalRandom.current().nextFloat() * MAX_WEIGHT;
        this.currentSatiety = ThreadLocalRandom.current().nextFloat() * MAX_SATIETY;
    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void eat(Animal animal) {

    }
}
