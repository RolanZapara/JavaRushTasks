package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

//        7 4 3
//        7 3 4

        //A
        if (a > b && a > c && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > b && a > c && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (a > b && a > c && b == c) {
            System.out.println(a + " " + c + " " + b);
        } else if (a > b && a == c && c > b) {
            System.out.println(a + " " + c + " " + b);
        }
        //B
        else if (b > a && b > c && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b > a && b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (b > a && b > c && a == c) {
            System.out.println(b + " " + c + " " + a);
        } else if (b > a && b == c && a < c) {
            System.out.println(b + " " + c + " " + a);
        }//C
        else if (c > a && c > b && a > b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c > a && c > b && b > a) {
            System.out.println(c + " " + b + " " + a);
        } else if (c > a && c > b && b == a) {
            System.out.println(c + " " + b + " " + a);
        } else if (a == b && a > c) {
            System.out.println(a + " " + b + " " + c);
        }
        //0 0 0
        else if (c == a && c == b && b == a) {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
