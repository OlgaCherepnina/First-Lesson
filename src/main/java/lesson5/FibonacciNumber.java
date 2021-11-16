package lesson5;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ведите значение числа n для получения значения последовательности Фибоначчи: ");
        int n = console.nextInt();
        System.out.println("F(n) = " + fibonacci(n));
    }

    static int fibonacci(int n) {
        int f_prev = 0;
        int f_current = 1;

        for (int i = 2; i <= n; i++) {
            f_current = f_prev + f_current;
            f_prev = f_current - f_prev;
        }

        return f_current;
    }
}
