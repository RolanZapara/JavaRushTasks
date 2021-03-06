/*package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

    }
}

*/
package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        int max = 1;
        int sequence = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                if (++sequence > max) {
                    max = sequence;
                }
            } else {
                sequence = 1;
            }
        }

        System.out.println(max);
    }
}