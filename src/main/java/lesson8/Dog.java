package lesson8;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String speech() {
        return breed + " " + super.speech() + "-" + getVoice() + "-" + getVoice();
    }
}
