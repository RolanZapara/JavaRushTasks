package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/
public class Solution {
    public static void main(String[] args) {
        reset();
    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = bufferedReader.readLine();
            if (value == "helicopter") {
                result = new Helicopter();
            } else if (value == "plane") {
                int numbers = Integer.parseInt(bufferedReader.readLine());
                result = new Plane(numbers);
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
