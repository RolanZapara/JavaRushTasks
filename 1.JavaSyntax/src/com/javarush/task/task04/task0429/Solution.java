package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());
        int negativeResult = 0;
        int positiveResult = 0;

        if (a > 0) {
            positiveResult = positiveResult + 1;
        } else if (a < 0) {
            negativeResult = negativeResult + 1;
        }

        if (b > 0) {
            positiveResult = positiveResult + 1;
        } else if (b < 0) {
            negativeResult = negativeResult + 1;
        }

        if (c > 0) {
            positiveResult = positiveResult + 1;
        } else if (c < 0) {
            negativeResult = negativeResult + 1;
        }


        System.out.println("количество отрицательных чисел: " + negativeResult);
        System.out.println("количество положительных чисел: " + positiveResult);

    }
}
