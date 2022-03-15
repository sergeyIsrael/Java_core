package Lesson_4_Collection;

import java.util.*;


public class Task_1 {

//     1)  ARRAY массив авто
    public static String[] arrayString = {"Volvo", "BMW", "BMW", "Ford", "Mazda", "VAZ", "VAZ",
            "Lexus", "Opel", "Toyota", "Kia", "UAZ", "UAZ"};

//     2)  LIST from array (чтобы совершать операции)
    public static List<String> arrayList = new ArrayList<>(Arrays.asList(arrayString));


    public static void main(String[] args) {

        System.out.println();
        System.out.print(arrayList.toString() + "\n");
        System.out.println("List size=  " + arrayList.size());

    //      3)  Hashset - уникальный "массив"
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.print(hashSet.toString() + "\n");
        System.out.println("Set size=  " + hashSet.size());
        System.out.println();

    //      4)  Hashmap (K,V - K - уникальный) записать кол-во повторений
        HashMap<String,Integer> resultHashMap = new HashMap<>();
    //        пробегаемся по hashSet
        for(String car: hashSet){
    //            (пробегаемся по arrayList)
            resultHashMap.put(car, countV(car));
        }
        System.out.println(resultHashMap);

    }


//      5)   Метод чтобы поссчитать кол-во повторений и записать в HashMap
    public static Integer countV(String carFromHashSet){
        Integer result = 0;
        for (String i : arrayList) {
            if (i.equals(carFromHashSet)) result++;
        }
        return result;
    }
//    V2
//    Collections.frequency(arrayList, i)
//    V2
}



