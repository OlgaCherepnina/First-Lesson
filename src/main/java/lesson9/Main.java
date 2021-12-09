package lesson9;

import lesson9.devices.Automobile;
import lesson9.devices.Car;
import lesson9.devices.Truck;

public class Main {
    public static void main(String[] args) {
        Automobile[] vehicles = new Automobile[10];

        for (int i = 0; i < 10; i++) {
            boolean isCar = Math.random() < 0.5;

            if (isCar) {
                int maxPassengerSeats = (int) (Math.random() * 7);
                vehicles[i] = new Car("Car Brand " + i, maxPassengerSeats);
            } else {
                int maxLoadWeight = (int) (Math.random() * 900) + 100;
                vehicles[i] = new Truck("Truck Brand " + i, maxLoadWeight);
            }
        }

        for (Automobile current : vehicles) {
            int distance = (int) (Math.random() * 1000);
            current.move(distance);
        }
    }
}
