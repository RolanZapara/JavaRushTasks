package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String pathToFile = reader.readLine();
       FileInputStream fIs = new FileInputStream(pathToFile);
      
       Scanner sc = new Scanner(fIs);
       StringBuilder builder = new StringBuilder();
       
       
       while (sc.hasNextLine()) {
           builder.append(sc.nextLine()).append("\n");
       }

        System.out.println(builder.toString());

       fIs.close();
       reader.close();





    }
}