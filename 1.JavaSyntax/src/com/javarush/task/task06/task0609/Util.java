package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import java.util.Map;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double resultX = (x2-x1)*(x2-x1);
        double resultY = (y2-y1)*(y2-y1);
        double result = Math.sqrt(resultX+resultY);
        return result;
    }

    public static void main(String[] args) {

    }
}
