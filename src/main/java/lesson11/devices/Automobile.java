package lesson11.devices;

public abstract class Automobile {
    private AutomobileType type;
    private String license;
    private double speed;
    private double weight;
    private double width;
    private double length;
    private double height;

    public Automobile(String license, double speed, double weight, double width, double length, double height) {
        this.license = license;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public AutomobileType getType() {
        return type;
    }

    public void setType(AutomobileType type) {
        this.type = type;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean passCheckpoint() {
        if (speed > 80 && speed < 100) {
            throw new IllegalArgumentException(String.format("%s автомобиль с номером %s едет через КПП быстрее разрешенной скорости", type.getType(), license));
        } else if (speed >= 100) {
            throw new IllegalArgumentException(String.format("%s автомобиль с номером %s едет с большим привышением скорости, вызвана полиция", type.getType(), license));
        }

        if (weight > 8000) {
            throw new IllegalArgumentException(String.format("%s автомобиль с номером %s не может быть пропущен через КПП из-за перегруза", type.getType(), license));
        } else if (width > 2.5) {
            throw new IllegalArgumentException(String.format("%s автомобиль с номером %s не может быть пропущен через КПП из-за превышения ширины", type.getType(), license));
        } else if (height > 4) {
            throw new IllegalArgumentException(String.format("%s автомобиль с номером %s не может быть пропущен через КПП из-за превышения высоты", type.getType(), license));
        }

        System.out.println(String.format("%s автомобиль с номером %s проехал через КПП без проишествий", type.getType(), license));

        return true;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "type=" + type +
                ", license='" + license + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
