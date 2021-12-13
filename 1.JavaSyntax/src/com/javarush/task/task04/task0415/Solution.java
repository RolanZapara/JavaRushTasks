package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());
        String result = methodForTriangle(a, b, c);
        System.out.println(result);
    }

    public static String methodForTriangle(int a, int b, int c) {
        String successfulResult = "Треугольник существует.";
        String notSuccessfulResult = "Треугольник не существует.";
        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            return successfulResult;
        } else return notSuccessfulResult;

    }
}
