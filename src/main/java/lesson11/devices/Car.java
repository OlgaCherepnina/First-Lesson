package lesson11.devices;

public final class Car extends Automobile {
    {
        setType(AutomobileType.CAR);
    }

    private int maxPassengerSeats;

    public Car(String license, double speed, double weight, double width, double length, double height, int maxPassengerSeats) {
        super(license, speed, weight, width, length, height);
        this.maxPassengerSeats = maxPassengerSeats;
    }

    public int getMaxPassengerSeats() {
        return maxPassengerSeats;
    }

    public void setMaxPassengerSeats(int maxPassengerSeats) {
        this.maxPassengerSeats = maxPassengerSeats;
    }
}
