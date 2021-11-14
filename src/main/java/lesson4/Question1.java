package lesson4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска целочисленного квадратного корня: ");
        int number = scanner.nextInt();

        findSqrtRoot(number);
    }

    static void findSqrtRoot(int number) {
        if (number < 0) {
            System.out.println("Нельзя использовать отрицательные числа");
            return;
        }
        int sqrtCandidate = number;
        while (number != sqrtCandidate * sqrtCandidate) {
            sqrtCandidate--;
            if (sqrtCandidate == 0) {
                System.out.println("Не найдено целочисленных корней");
                return;
            }
        }

        System.out.println("Корень числа " + number + " равен +-" + sqrtCandidate);
    }
}
