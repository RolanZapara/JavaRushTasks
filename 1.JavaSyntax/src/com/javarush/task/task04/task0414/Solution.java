package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int yearFromUser = Integer.valueOf(reader.readLine());

        System.out.println("количество дней в году: " + definitionNumberOfDaysInYear(yearFromUser));


    }

    public static int definitionNumberOfDaysInYear(int inputYear) {
        int usualYear = 365;
        int visokosniyYear = 366;

        int division400 = inputYear % 400;
        int division100 = inputYear % 100;
        int division4 = inputYear % 4;

        if (division400 == 0) {
            return visokosniyYear;
        } else if (division400 != 0 && division100 == 0) {
            return usualYear;
        } else if (division400 != 0 && division100 != 0 && division4 == 0) {
            return visokosniyYear;
        } else return usualYear;


    }


}