package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 40; i != 0; i--) {
            System.out.println(text);
            StringBuffer sb = new StringBuffer(text);
            //invoking the method
            sb.deleteCharAt(0);
            text = String.valueOf(sb);
            //prints the string after deleting the character
        }

        //напишите тут ваш код
    }

}

