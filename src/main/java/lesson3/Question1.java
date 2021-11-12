package lesson3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Введите значения переменных:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();

        calculate(a, b, c);
    }

    static void calculate(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0.");
        } else if (d < 0) {
            System.out.println("Нет действительных решений.");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            if (x1 == x2) {
                System.out.println("Решение: x = " + x1);
            } else {
                System.out.println("Решение: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
