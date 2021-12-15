package lesson12.exceptions;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j, String a) {
        super(String.format("Элемент массива %dx%d не содержит целочисленного значение. Значения ячейки равно '%s'", i, j, a));
    }
}
