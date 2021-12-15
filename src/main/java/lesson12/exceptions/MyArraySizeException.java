package lesson12.exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int i, int j) {
        super(String.format("Неверный размер массива. Размер массива %dx%d, а должен быть 4х4!", i, j));
    }
}
