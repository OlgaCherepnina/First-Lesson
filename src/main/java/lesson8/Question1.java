package lesson8;

public class Question1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
        cat.setVoice("мяу");
        cat.setColor("Рыжий");

        Dog dog = new Dog();
        dog.setName("Мухтар");
        dog.setBreed("Овчарка");
        dog.setVoice("гав");

        Sparrow sparrow = new Sparrow();
        sparrow.setName("Цезарь");
        sparrow.setStatus("Замерший");
        sparrow.setVoice("чик-чирик");

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = sparrow;

        for (Animal i : animals) {
            i.voice();
        }
    }
}
