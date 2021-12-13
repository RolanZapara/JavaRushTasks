package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> inputsFromKeyboard = new ArrayList<>();
        //напишите тут ваш код
        try {
            String string;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                string = reader.readLine();
                inputsFromKeyboard.add(Integer.valueOf(string));
            }
        } catch (Exception e) {
            for (Integer value : inputsFromKeyboard) {
                System.out.println(value);
            }
        }
    }
}
