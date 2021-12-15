package lesson11.devices;

public final class Truck extends Automobile {
    {
        setType(AutomobileType.TRUCK);
    }

    private int maxLoadWeight;

    public Truck(String license, double speed, double weight, double width, double length, double height, int maxLoadWeight) {
        super(license, speed, weight, width, length, height);
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }
}
