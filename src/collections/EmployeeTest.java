package collections;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a1234", "Steve Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1238", "Bill Gates");

        System.out.println(map);

        String[] testId = {"a1234", "a1235", "a1236", "a1238", "b1234", "b1235"};

        for(String id : testId){
            if (map.get(id) != null){
                System.out.printf("The id: '%s' is for employee: '%s'%n", id, map.get(id));
            } else {
                System.out.printf("No employye with id: '%s'. %n", id);
            }
        }
    }
}
