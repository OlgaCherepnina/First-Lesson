package lesson11;

import lesson11.devices.Automobile;
import lesson11.devices.Car;
import lesson11.devices.Truck;

public class CheckpointPasser {
    public static void main(String[] args) {
        Automobile[] automobiles = new Automobile[10];

        for (int i = 0; i < 10; i++) {
            automobiles[i] = generateAutomobile();
        }

        for (Automobile i : automobiles) {
            try {
                System.out.println(i.toString());
                i.passCheckpoint();
            } catch (IllegalArgumentException e) {
                System.out.println("Произошла ситуация на которую необходимо обратить внимание! " + e.getMessage());
            }

            System.out.println();
        }
    }

    private static Automobile generateAutomobile() {
        boolean isCar = Math.random() < 0.5;

        double randomSpeed = Math.random() * 110;
        double randomWeight = Math.random() * 8500 + 500;
        double randomWidth = Math.random() * 0.5 + 2.1;
        double randomLength = Math.random() * 5 + 1.5d;
        double randomHeight = Math.random() * 4 + 1;

        if (isCar) {
            int randomMaxPassengerSeats = (int) (Math.random() * 7);
            return new Car(generateLicense(), randomSpeed, randomWeight, randomWidth, randomLength, randomHeight, randomMaxPassengerSeats);
        } else {
            int randomMaxLoadWeight = (int) (Math.random() * 900) + 100;
            return new Truck(generateLicense(), randomSpeed, randomWeight, randomWidth, randomLength, randomHeight, randomMaxLoadWeight);
        }
    }

    private static String generateLicense() {
        int carNumber = (int) (Math.random() * 998) + 1;

        return String.format("IT%03dPARK", carNumber);
    }
}
