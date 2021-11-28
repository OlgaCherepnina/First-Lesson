package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = console.nextInt();

        double[] a = fillArray(n);

        System.out.println(Arrays.toString(a));
        System.out.println("Минимальное значение в массиве равно: " + minimumValue(a));
        System.out.println("Максимальное значение в массиве равно:" + maximumValue(a));
        System.out.println("Среднее значение в массиве равно: " + averageValue(a));
    }

    public static double[] fillArray(int size) {
        double[] arrayNumber = new double[size];

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = Math.random();
        }

        return arrayNumber;
    }

    public static double minimumValue(double[] arrayNumber) {
        double minimumValue = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (minimumValue > arrayNumber[i])
                minimumValue = arrayNumber[i];
        }

        return minimumValue;
    }

    public static double maximumValue(double[] arrayNumber) {
        double maximumValue = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (maximumValue < arrayNumber[i])
                maximumValue = arrayNumber[i];
        }

        return maximumValue;
    }

    public static double averageValue(double[] arrayNumber) {
        double sum = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            sum += arrayNumber[i];
        }

        double avgEtalon = sum / arrayNumber.length;

        double diff = Math.abs(avgEtalon - arrayNumber[0]);
        double result = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (diff > Math.abs(avgEtalon - arrayNumber[i])) {
                diff = Math.abs(avgEtalon - arrayNumber[i]);
                result = arrayNumber[i];
            }
        }

        return result;
    }
}
