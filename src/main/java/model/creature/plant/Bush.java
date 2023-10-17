package model.creature.plant;

import model.creature.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Bush extends Plant {
    private float weight;
    private float altitude;

    public Bush(float maxWeight, float maxAltitude) {
        super(maxWeight, maxAltitude);

        weight = ThreadLocalRandom.current().nextFloat() * maxWeight;

        altitude = ThreadLocalRandom.current().nextFloat() * maxAltitude;
    }
}

