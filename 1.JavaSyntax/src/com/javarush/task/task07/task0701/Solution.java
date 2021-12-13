package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] number = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.valueOf(reader.readLine());
        }
        return number;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int ktr = 0; ktr < array.length; ktr++) {
            if (array[ktr] > max) {
                max = array[ktr];
            }
        }
        return max;
    }
}
