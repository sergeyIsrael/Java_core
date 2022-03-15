package Lesson_4_Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class PhoneBook {

    private HashMap<Integer, String> phoneBookMap = new HashMap<>();


    public void add(Integer phone, String familyName) {
        phoneBookMap.put(phone, familyName);
    }

    // get phone number/s
    public String get (String familyName) {
       if (phoneBookMap.containsValue(familyName)) {
               String phones = familyName + " phone: ";
               for(Integer key: phoneBookMap.keySet()) {
                   if (phoneBookMap.get(key).equals(familyName))
                       phones += key + "; ";
               }
               return phones;
       } else return "Contact doesn't exist. 😐";
    }


}
