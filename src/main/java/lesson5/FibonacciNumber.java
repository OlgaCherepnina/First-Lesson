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
        if (n == 0) {
            return 0;
        }
        int fPrev = 0;
        int fCurrent = 1;

        for (int i = 2; i <= n; i++) {
            fCurrent = fPrev + fCurrent;
            fPrev = fCurrent - fPrev;
        }

        return fCurrent;
    }
}
