package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        for (int i = 0; i < M; i++) {
            strings.add(strings.remove(0));
        }
        
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
