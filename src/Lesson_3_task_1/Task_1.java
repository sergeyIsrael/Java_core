package Lesson_3_task_1;

// Написать метод, который меняет два элемента массива местами
// (массив может быть любого ссылочного типа);

import java.util.Arrays;

public class Task_1 {

    public static void switchIndex(String[] myArray, int index1, int index2)
            throws myArrayIndexOutOfBoundsException {
        int lengthArray = myArray.length-1;
        if (index1 > myArray.length || index2 > myArray.length) {
            throw new myArrayIndexOutOfBoundsException("Великоват твой индекс! Выбери диапазон от 0 до "
                    + lengthArray);
        }
            String temp1 = myArray[index1];
            String temp2 = myArray[index2];
            myArray[index1] = temp2;
            myArray[index2] = temp1;
    }



    public static void main(String args[]) {

        String[] cars = {"Porshe", "Mazeratti", "Niva", "Mercedes-Benz", "Audi"};

        System.out.println(Arrays.toString(cars));
        try {
            Task_1.switchIndex(cars, 0,4);
        } catch (myArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(cars));



    }
}
