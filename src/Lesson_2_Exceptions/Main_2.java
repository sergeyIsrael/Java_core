package Lesson_2_Exceptions;

// 1) Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// 2) При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

// 3) Далее метод должен пройтись по всем элементам массива,
// преобразовать в int и просуммировать.
// 4) Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией,
// в какой именно ячейке лежат неверные данные.

// 5) В методе main():
// - вызвать полученный метод,
// - обработать возможные исключения MyArraySizeException и MyArrayDataException
// - и вывести результат расчета.

import java.lang.reflect.Array;

public class Main_2 {

    static int row = 4; // строки
    static int column = 4; // столбцы

    static int methodArray44(String[][] array) throws MyArraySizeException, MyArrayDataException {
        //        проверка длинны строк
        int summ = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк в массиве должно быть 4");
        }
        //        проверка длинны столбцов
        for (int i = 0; i < array.length; i++) {
            if (4 != array[i].length) {
                throw new MyArraySizeException("Количество столбцов в массиве должно быть 4");
            }
            //            суммирование и + перевод в инт
            for (int j = 0; j < array[i].length; j++) {
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return summ;
    }



    public static void main(String args[]) {

        //    Двумерный строковый массив - верный 👍
        String[][] array4x4Good = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};

        // этот массив - не пройдёт по размеру
        String[][] arrayBadSize = {
                {"2", "2", "2", "2", "7"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};

        // этот массив  - не удастся преобразовать в инт [1][2]
        String[][] arrayBadInt = {
                {"7", "7", "2", "2"},
                {"7", "7", "Манишма", "3"},
                {"7", "7", "3", "3"},
                {"5", "5", "4", "4"}};


//        ЛОВИМ ИСКЛЮЧЕНИЯ (полёт нормальный)
        System.out.println("ЛОВИМ ИСКЛЮЧЕНИЯ раз");
            try {
                System.out.println( methodArray44(array4x4Good) );
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
                e.getMessage();
            }
        System.out.println();

        //        ЛОВИМ ИСКЛЮЧЕНИЯ два
        System.out.println("ЛОВИМ ИСКЛЮЧЕНИЯ два");
        try {
            System.out.println( methodArray44(arrayBadInt) );
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println();

        //        ЛОВИМ ИСКЛЮЧЕНИЯ три
        System.out.println("ЛОВИМ ИСКЛЮЧЕНИЯ три");
        try {
            System.out.println( methodArray44(arrayBadSize) );
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println();

    }
}
