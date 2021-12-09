package lesson10.convertors;

public class ToCelsiusConverter implements TemperatureConverter {
    @Override
    public float convert(float temperature, Scale scale) {
        return switch (scale) {
            case CELSIUS -> temperature;
            case FAHRENHEIT -> (temperature - 32f) * 5 / 9;
            case KELVIN -> temperature - 273.15f;
        };
    }
}
