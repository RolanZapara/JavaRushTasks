package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        int a_number = 0;
        int b_number = 0;
        int c_number = 0;
//        if (a > 0 && b > 0 && c > 0) {
//            System.out.println(3);
//        }
        if (a > 0 ) {
            a_number = 1;
        }

        if (b > 0 ) {
            b_number = 1;
        }
        if (c > 0 ) {
            c_number = 1;
        }
        int result = a_number + b_number + c_number;

        System.out.println(result);


    }
}
