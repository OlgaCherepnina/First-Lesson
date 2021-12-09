package lesson9.devices;

public abstract class Automobile {
    private String brand;
    private int maxDistance;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public abstract void move(int distance);
}
