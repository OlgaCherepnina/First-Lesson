package lesson12;

import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MyArraySizeException;

import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) throws MyArraySizeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер матрицы x (для нормальной работы необходимо 4): ");
        int x = scanner.nextInt();
        System.out.print("Введите размер матрицы y (для нормальной работы необходимо 4): ");
        int y = scanner.nextInt();
        System.out.print("Нужны только цифры (true) или цифры и символы (false): ");
        boolean onlyNumber = scanner.nextBoolean();

        String[][] matrix = fillMatrix(x, y, onlyNumber);

        printMatrix(matrix);

        int sum = sumMatrix(matrix);

        System.out.println(String.format("Сумма матрицы равна %d", sum));
    }

    public static int sumMatrix(String[][] matrix) throws MyArraySizeException {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeException(matrix.length, matrix[0].length);
        }

        int result = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, matrix[i][j]);
                }
            }
        }

        return result;
    }

    private static String[][] fillMatrix(int sizeI, int sizeJ, boolean onlyNumber) {
        String[][] matrix = new String[sizeI][sizeJ];

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                matrix[i][j] = String.valueOf((int) (Math.random() * 10));

                if ((!onlyNumber && Math.random() > 0.7)    // Случайно добавляем символ А, гарантий добавления символа нет
                        || (i == sizeI - 1 && j == sizeJ - 1 && !onlyNumber)) {   // Если символ не был добавлен, то добавляем его в последний элемент матрицы
                    matrix[i][j] += "A";
                    onlyNumber = true;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
