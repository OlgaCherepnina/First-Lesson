package lesson7;

public class Question {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", "Рыжий", 5);
        cat.run(10);
        cat.swim(10);

        Tiger tiger = new Tiger("Шархан", 10);
        tiger.run(100);
        tiger.swim(50);

        Dog dog = new Dog("Барбос", "Черный", 1);
        dog.run(1000);
        dog.swim(400);
    }
}
