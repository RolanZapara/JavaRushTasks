package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array1 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[10+i];
        }
        for (int valueArray3 : array3) {
            System.out.println(valueArray3);
        }
    }
}
