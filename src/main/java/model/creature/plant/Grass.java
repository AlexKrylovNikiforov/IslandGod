package model.creature.plant;

import model.creature.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Grass extends Plant {
    private float weight;
    private float altitude;

    public Grass(float maxWeight, float maxAltitude) {
        super(maxWeight, maxAltitude);
        weight = ThreadLocalRandom.current().nextFloat() * maxWeight;
        altitude = ThreadLocalRandom.current().nextFloat() * maxAltitude;
    }
}
