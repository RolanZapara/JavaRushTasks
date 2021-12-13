package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            //todo Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
            double indexWeight = weight / (height * height);
            String less18_5 = "Недовес: меньше чем 18.5";
            String between18_5and25 = "Нормальный: между 18.5 и 25";
            String between25and30 = "Избыточный вес: между 25 и 30";
            String overweightMore30 = "Ожирение: 30 или больше";

            if (indexWeight < 18.5) {
                System.out.println(less18_5);
            } else if (indexWeight >= 18.5 && indexWeight < 25) {
                System.out.println(between18_5and25);
            } else if (indexWeight >= 25 && indexWeight < 30) {
                System.out.println(between25and30);
            } else if (indexWeight >= 30) {
                System.out.println(overweightMore30);
            }


        }
    }
}
