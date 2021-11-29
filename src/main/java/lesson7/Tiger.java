package lesson7;

public class Tiger extends Animal {
    String color;
    int age;

    public Tiger(String nickname, int age) {
        this.nickname = nickname;
        this.color = "Рыжий и полосатый";
        this.age = age;
        this.maxRunDistance = 1000;
        this.maxSwimDistance = 200;
    }
}
