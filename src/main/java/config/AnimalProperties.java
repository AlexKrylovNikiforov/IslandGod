package config;

public class AnimalProperties {
    private float maxWeight;
    private float maxSatiety;
    private int speed;

    public AnimalProperties(float maxWeight, float maxSatiety, int speed) {
        this.maxWeight = maxWeight;
        this.maxSatiety = maxSatiety;
        this.speed = speed;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(float maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
