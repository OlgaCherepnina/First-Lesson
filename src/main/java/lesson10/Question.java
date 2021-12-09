package lesson10;

import lesson10.convertors.*;

import java.util.Scanner;

import static lesson10.convertors.Scale.*;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите изначальную шкалу (C, F, K): ");
        Scale fromScale = switch (in.next()) {
            case "C" -> CELSIUS;
            case "F" -> FAHRENHEIT;
            case "K" -> KELVIN;
            default -> throw new IllegalStateException("Неверная шкала");
        };
        System.out.print("Введите температуру: ");
        float temperature = in.nextFloat();

        System.out.print("Введите в какую шкалу нужно конвертировать температуру (C, F, K): ");
        Scale toScale = switch (in.next()) {
            case "C" -> CELSIUS;
            case "F" -> FAHRENHEIT;
            case "K" -> KELVIN;
            default -> throw new IllegalStateException("Неверная шкала");
        };

        TemperatureConverter converter = switch (toScale) {
            case KELVIN -> new ToKelvinConverter();
            case FAHRENHEIT -> new ToFahrenheitConverter();
            case CELSIUS -> new ToCelsiusConverter();
        };

        float convertedTemperature = converter.convert(temperature, fromScale);

        System.out.println("Конвертированная температура: " + convertedTemperature);
    }
}
