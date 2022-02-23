package Lesson_2_Exceptions;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int column) {
        super(String.format("Невалидное значение в массиве ( ячейка %d, %d ) \n", row, column ));
    }
}
