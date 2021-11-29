package lesson8;

public class Sparrow extends Animal {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String speech() {
        return status + " " + super.speech();
    }
}
