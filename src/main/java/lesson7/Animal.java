package lesson7;

public class Animal {
    String nickname;
    int maxRunDistance;
    int maxSwimDistance;

    public void run(int distance) {
        if (maxRunDistance == 0) {
            System.out.println(nickname + " не умеет бегать.");
            return;
        } else if (distance > maxRunDistance) {
            System.out.println(nickname + " пробежал " + maxRunDistance + " м и устал.");
            return;
        }

        System.out.println(nickname + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(nickname + " не умеет плавать.");
            return;
        } else if (distance > maxSwimDistance) {
            System.out.println(nickname + " проплыл " + maxSwimDistance + " м и устал.");
            return;
        }

        System.out.println(nickname + " проплыл " + distance + " м.");
    }
}
