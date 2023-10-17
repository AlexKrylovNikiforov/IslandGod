package model.creature;

public abstract class Plant {
    protected final float MAX_WEIGHT;
    protected final float MAX_ALTITUDE;

    public Plant(float maxWeight, float maxAltitude) {
        MAX_WEIGHT = maxWeight;
        MAX_ALTITUDE = maxAltitude;
    }
}
