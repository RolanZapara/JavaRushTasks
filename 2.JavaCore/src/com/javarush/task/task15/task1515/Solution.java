package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A = 0;
    public static int B = 0;

   static {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
       } catch (IOException e) {
           System.out.println("Unexpected exception! Try again");
       }
   }

    public static void main(String[] args) {
        System.out.println(min(A, B));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
