package lesson10.convertors;

public class ToFahrenheitConverter implements TemperatureConverter {
    @Override
    public float convert(float temperature, Scale scale) {
        return switch (scale) {
            case FAHRENHEIT -> temperature;
            case CELSIUS -> (temperature * 9f / 5f) + 32f;
            case KELVIN -> (temperature - 273.15f) * 9f / 5f + 32f;
        };
    }
}
