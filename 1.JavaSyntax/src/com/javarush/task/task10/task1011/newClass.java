package com.javarush.task.task10.task1011;

import java.util.*;
import java.io.*;

class newClass {


    public static void main(String[] args) {
        String name = "ZooolatechCredible";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            String symbol = String.valueOf(name.toUpperCase().charAt(i));
            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                map.put(symbol, (map.get(symbol)+1));
            }
        }
        System.out.println(map);
    }
}