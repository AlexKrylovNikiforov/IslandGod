package model.creature.animal;

import model.creature.Animal;
import model.creature.Herbivorous;
import model.creature.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Goat implements Animal, Herbivorous {
    private final float MAX_WEIGHT;
    private final float SPEED;
    private final float MAX_SATIETY;
    private float currentWeight;
    private float currentSatiety;
    private final String GENDER = Math.random() <= 0.5 ? "male" : "female";

    public Goat (float maxWeight, float speed, float maxSatiety) {
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
    public void eat(Plant plant) {

    }
}
