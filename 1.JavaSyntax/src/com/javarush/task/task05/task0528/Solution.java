package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(Calendar.getInstance().getTime()));
    }
}
