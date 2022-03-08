package Lesson_3_Generic_task_2;

import java.util.ArrayList;
// Задача:
//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим на следующем уроке);
//Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

//Не забываем про метод добавления фрукта в коробку.

//Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
// которую подадут в compare() в качестве параметра.
// true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;

//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;


public class Box<T extends Fruit> {
    //    кладем все яблоки в ArrayList.
   private ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    //     высчитывает вес коробки, зная вес одного фрукта и их количество КАК ЭТО РАБОТАЕТ❓❓❓
    public double getWeightBox() {
        double weightBox = 0;
        for (T fruit : getFruitList()) {
            if (fruit != null) {
//                код ниже берёт каждый фрукт не из листа в коробке, а из класса Фрукт.
                double value = fruit.getWeightFruit();
                weightBox = weightBox + value;
             }
        }
        return weightBox;
    }

    public void showWeight(){
         if ( getWeightBox() == 0 ) {
            System.out.println("Коробка пуста 👀");
        } else {
            System.out.format("Вес коробки %.2f кг. %n", getWeightBox());
        }
    }


    //сравниваем коробки
    public boolean compareBool (Box<T> box) {
        return (this.getWeightBox() - box.getWeightBox()) == 0;
    }

    public void comparePrint (Box<?> box) {
        if ((this.getWeightBox() - box.getWeightBox()) != 0) {
            System.out.println("Вес Коробок разный");
        } else {
            System.out.println("Вес Коробок одинаковый 🙌");
        }
    }


    public void moveFruits (Box<T> otherBox) {
        otherBox.getFruitList().addAll(getFruitList());
        this.getFruitList().clear();
        System.out.println("Пересыпали эту коробку в другую коробку.");
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }
}