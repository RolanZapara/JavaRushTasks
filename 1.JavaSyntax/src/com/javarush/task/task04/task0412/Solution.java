package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberFromKeyboard = Integer.valueOf(reader.readLine());

        if (numberFromKeyboard > 0) {
            System.out.println(numberFromKeyboard * 2);
        } else if (numberFromKeyboard < 0) {
            System.out.println(numberFromKeyboard + 1);
        } else if (numberFromKeyboard == 0) System.out.println(numberFromKeyboard);


    }

}