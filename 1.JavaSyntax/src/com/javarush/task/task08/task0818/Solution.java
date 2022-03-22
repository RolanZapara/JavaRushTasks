package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1_asjdnas", 456);
        map.put("2_ahd", 755);
        map.put("3_jhbsdf", 500);
        map.put("4_jhsdbjshdfb", 499);
        map.put("5_asjhdbd", 501);
        map.put("6_askjdaksda", 100500);
        map.put("7_asgdasd", 15);
        map.put("8_alksdasdasd", 600);
        map.put("9_ambasdas", 1250);
        map.put("10_ajsdvajsd", 5000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //according to AC we have to remove all where salary less than 500
        Set<String> keys = map.keySet();
        System.out.println(keys);
//        for (int i = 0; i < map.size() - 1; i++) {
//            Integer value = map.get(i);
//            System.out.println(value);
//        }

        for (Integer value : map.values()) {
            if (value <= 500) {
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}