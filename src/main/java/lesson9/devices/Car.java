package lesson9.devices;

public final class Car extends Automobile {
    private int maxPassengerSeats;

    public Car(String brand, int maxPassengerSeats) {
        setBrand(brand);
        this.maxPassengerSeats = maxPassengerSeats;
        setMaxDistance(500);
    }

    @Override
    public void move(int distance) {
        if (distance <= getMaxDistance())
            System.out.printf("%s может проехать с %d пассажирами на расстояние %d км%n", getBrand(), this.maxPassengerSeats, distance);
        else
            System.out.printf("У %s не хватит топлива, чтобы проехать с %d пассажирами на расстояние %d км%n", getBrand(), this.maxPassengerSeats, distance);
    }
}
