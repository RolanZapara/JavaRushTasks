package com.javarush.task.task08.task0826;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        int[] array2 = new int[20];

        for (int i = 0; i < array2.length; i++) {
            int j = array2.length - i - 1;
            array2 [i] = array[j];
        }
        for (int i = 0; i < array2.length; i++) {
            array[i] = array2[i];
        }

        //напишите тут ваш код

    }
}
