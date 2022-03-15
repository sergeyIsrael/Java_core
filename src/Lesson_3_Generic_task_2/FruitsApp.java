package Lesson_3_Generic_task_2;

import java.util.ArrayList;

public class FruitsApp {
    public static void main(String[] args) {

//создаем ЯБЛОКИ 🍏
Apple apple1 = new Apple(0.5);
Apple apple2 = new Apple(0.2);
Apple apple3 = new Apple(0.3);
Apple apple4 = new Apple(0.55);

// создаем arrayList'ы яблок
    ArrayList<Apple> applesList1 = new ArrayList<>();
applesList1.add(apple1);
applesList1.add(apple2);
applesList1.add(apple3);
applesList1.add(apple4);

    ArrayList<Apple> applesList2 = new ArrayList<>();
applesList2.add(apple1);
applesList2.add(apple2);
applesList2.add(apple3);
applesList2.add(apple4);
applesList2.add(apple4);
applesList2.add(apple4);

    ArrayList<Apple> applesList3 = new ArrayList<>();
applesList3.add(apple1);
applesList3.add(apple2);
applesList3.add(apple3);
applesList3.add(apple4);
applesList3.add(apple4);


//создаём АПЕЛЬСИНЫ 🍊
Orange orange1 = new Orange(0.4);
Orange orange2 = new Orange(0.6);
Orange orange3 = new Orange(0.5);
Orange orange4 = new Orange(1.0);

// создаем arrayList'ы апельсинов
    ArrayList<Orange> orangesList1 = new ArrayList<>();
orangesList1.add(orange1);
orangesList1.add(orange2);
orangesList1.add(orange3);
orangesList1.add(orange4);

    ArrayList<Orange> orangesList2 = new ArrayList<>();
orangesList2.add(orange1);
orangesList2.add(orange2);
orangesList2.add(orange3);

    ArrayList<Orange> orangesList3 = new ArrayList<>();
orangesList3.add(orange1);
orangesList3.add(orange1);
orangesList3.add(orange1);
orangesList3.add(orange1);
orangesList3.add(orange2);
orangesList3.add(orange3);
orangesList3.add(orange4);
    //пустой
    ArrayList<Orange> orangesList00 = new ArrayList<>();

        //создаём Коробки Яблок 🍏 📦
        Box<Apple> appleBox1 = new Box<>(applesList1);
        Box<Apple> appleBox2 = new Box<>(applesList2);
        Box<Apple> appleBox3 = new Box<>(applesList3);

        //создаём Коробки Апельсин 🍊 📦
        Box<Orange> orangeBox1 = new Box<>(orangesList1);
        Box<Orange> orangeBox2 = new Box<>(orangesList2);
        Box<Orange> orangeBox3 = new Box<>(orangesList3);
        Box<Orange> orangeBox00 = new Box<>(orangesList00);




// - - - - - - ВЫПОЛНЯЕМ - - - - - -//

//        смотрим вес
        appleBox1.showWeight();
        System.out.println(applesList1.size());
        appleBox2.showWeight();
        System.out.println(applesList2.size());
//        пересыпаем и снова смотрим
        appleBox1.moveFruits(appleBox2);

        appleBox1.showWeight();
        System.out.println(applesList1.size());

        appleBox2.showWeight();
        System.out.println(applesList2.size());

        System.out.println();

//      сравниваем
        System.out.println("- - - - - - - - - - -");
        System.out.println("Сравниваем appleBox1 и orangeBox1 👇");
        appleBox1.comparePrint(orangeBox1);
        appleBox1.compareBool(orangeBox1);
        System.out.println("- - - - - - - - - - -");

//        смотрим вес уже апельсинов
        orangeBox3.showWeight();
        System.out.println(orangesList3.size());
        orangeBox2.showWeight();
        System.out.println(orangesList2.size());
//        пересыпаем и снова смотрим
        orangeBox3.moveFruits(orangeBox2);

        orangeBox3.showWeight();
        System.out.println(orangesList3.size());
        orangeBox2.showWeight();
        System.out.println(orangesList2.size());

        System.out.println();
        orangeBox00.showWeight();
        orangeBox1.showWeight();
        orangeBox1.moveFruits(orangeBox00);
        orangeBox1.showWeight();
        orangeBox00.showWeight();

    }
}
