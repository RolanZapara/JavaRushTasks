package com.javarush.task.task04.task0411;

/* 
Время года
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        int[] spring = {3,4,5};
        int[] summer = {6,7,8};
        int[] autumn = {9,10,11};
        int[] winter = {12,1,2};
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("осень");
        }


    }
}