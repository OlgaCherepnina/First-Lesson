package lesson8;

public class Question {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
        cat.setVoice("мяу");
        cat.setColor("Рыжий");
        cat.say();

        Dog dog = new Dog();
        dog.setName("Мухтар");
        dog.setBreed("Овчарка");
        dog.setVoice("гав");
        dog.say();

        Sparrow sparrow = new Sparrow();
        sparrow.setName("Цезарь");
        sparrow.setStatus("Замерший");
        sparrow.setVoice("чик-чирик");
        sparrow.say();
    }
}
