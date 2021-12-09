package lesson9.devices;

public final class Truck extends Automobile {
    private int maxLoadWeight;

    public Truck(String brand, int maxLoadWeight) {
        setBrand(brand);
        this.maxLoadWeight = maxLoadWeight;
        setMaxDistance(1200);
    }

    @Override
    public void move(int distance) {
        if (distance <= getMaxDistance())
            System.out.printf("%s может перевезти с %d кг груза на расстояние %d км%n", getBrand(), this.maxLoadWeight, distance);
        else
            System.out.printf("У %s не хватит топлива, чтобы перевезти с %d кг груза на расстояние %d км%n", getBrand(), this.maxLoadWeight, distance);
    }
}
