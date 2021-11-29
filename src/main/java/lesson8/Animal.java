package lesson8;

public class Animal {
    private String name;
    private String voice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String speech() {
        return name + " говорит " + voice;
    }

    public void say() {
        System.out.println(speech());
    }
}
