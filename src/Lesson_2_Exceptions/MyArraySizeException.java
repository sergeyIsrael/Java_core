package Lesson_2_Exceptions;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String error) {
        super(error);
    }
}
