package com.javarush.task.task13.task1308;

/* 
Эй, ты там живой?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inputValue = reader.readLine();
//        boolean abc = Boolean.parseBoolean(inputValue);
//        System.out.println("result = " + Person.isAlive(abc));
    }



    public interface Person {
        boolean isAlive();
//            if (a) { return true; }
//            else return false;

    }
    interface Presentable extends Person{

    }
}