package Lesson_4_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneBookApp {

    public static void main(String[] args) {

PhoneBook phoneBook = new PhoneBook();
phoneBook.add(051345234, "Sidorov");
phoneBook.add(073355234, "Petrov");
phoneBook.add(023423423, "Frolov");
phoneBook.add(045646545, "Kravchenko");
phoneBook.add(066667433, "Goodguy");
phoneBook.add(011144332, "Sidorov");
phoneBook.add(017730001, "Frolov");

        System.out.println();
        System.out.println(phoneBook.get("Sidorov"));
        System.out.println(phoneBook.get("Antonov"));

    }
}
