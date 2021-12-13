package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberFromUser = Integer.valueOf(reader.readLine());

        if (numberFromUser == 1) {
            System.out.println("понедельник");
        } else if (numberFromUser == 2) {
            System.out.println("вторник");
        } else if (numberFromUser == 3) {
            System.out.println("среда");
        } else if (numberFromUser == 4) {
            System.out.println("четверг");
        } else if (numberFromUser == 5) {
            System.out.println("пятница");
        } else if (numberFromUser == 6) {
            System.out.println("суббота");
        } else if (numberFromUser == 7) {
            System.out.println("воскресенье");
        } else System.out.println("такого дня недели не существует");


    }
}