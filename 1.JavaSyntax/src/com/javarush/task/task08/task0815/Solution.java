package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> newMap = new HashMap<>();
        Map<String, String> testMap = new HashMap<>();
        testMap.put("LastName", "FirstName");
        for (String key : testMap.keySet()) {
            for (int i = 0; i < 10; i++) {
                newMap.put(key + i, String.valueOf(i));
            }
        }

        return newMap;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int i = 0;
        try {
            for (String fN : map.values()) {
                if (fN.equals(name)) {
                    i++;
                }
            }
            return i;
        } catch (Exception e) {
            System.out.println("pizdec");
        }
        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int i = 0;
        try {
            if (map.containsKey(lastName)) {
                i = 1;
            }
        } catch (Exception e) {
            System.out.println("another pizdec");
        }
        return i;
    }

    public static void main(String[] args) {
createMap();
    }
}
