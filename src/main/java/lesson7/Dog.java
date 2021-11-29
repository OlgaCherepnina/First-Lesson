package lesson7;

public class Dog extends Animal {
    String color;
    int age;

    public Dog(String nickname, String color, int age) {
        this.nickname = nickname;
        this.color = color;
        this.age = age;
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
    }
}
