package lesson6;

import java.util.Scanner;

public class FibonacciNumberWithCache {
    static int[] fibonacciCache = {0, 1};

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Ведите значение числа n для получения значения последовательности Фибоначчи (0 для выхода): ");
            if (!console.hasNextInt() && console.next().equals("exit")) {
                System.exit(0);
            }
            int n = console.nextInt();
            System.out.println("F(n) = " + findN(n));
        }
    }

    public static int findN(int n) {
        if (fibonacciCache.length - 1 < n) {
            extendFibonacciCache(n);
        }

        return fibonacciCache[n];
    }

    private static void extendFibonacciCache(int n) {
        int[] newCache = new int[n + 1];

        // Копируем старый кеш в новый
        for (int i = 0; i < fibonacciCache.length; i++) {
            newCache[i] = fibonacciCache[i];
        }

        // Добавляем дополнительные значения
        for (int i = fibonacciCache.length; i <= n; i++) {
            newCache[i] = newCache[i - 2] + newCache[i - 1];
        }

        fibonacciCache = newCache;
    }
}
