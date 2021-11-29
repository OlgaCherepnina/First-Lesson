package lesson7;

public class Cat extends Animal {
    String color;
    int age;

    public Cat(String nickname, String color, int age) {
        this.nickname = nickname;
        this.color = color;
        this.age = age;
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
    }
}
