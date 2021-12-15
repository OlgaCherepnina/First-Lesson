package lesson11.devices;

public enum AutomobileType {
    CAR("Легковой"),
    TRUCK("Грузовой");

    private String type;

    AutomobileType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
