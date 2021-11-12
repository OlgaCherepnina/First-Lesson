package lesson3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.print("Введите число n для расчета n!: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        factorial(n);
    }

    static void factorial(int n) {
        int result = n;

        while (n > 1) {
            n = n - 1;
            result = result * n;
        }

        System.out.println("Результат n! = " + result);
    }
}
