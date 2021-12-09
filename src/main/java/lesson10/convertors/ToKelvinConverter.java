package lesson10.convertors;

public class ToKelvinConverter implements TemperatureConverter {
    @Override
    public float convert(float temperature, Scale scale) {
        return switch (scale) {
            case KELVIN -> temperature;
            case CELSIUS -> temperature + 273f;
            case FAHRENHEIT -> (temperature - 32f) * 5f / 9f + 273.15f;
        };
    }
}
