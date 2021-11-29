package lesson8;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speech() {
        return color + " " + super.speech();
    }
}
