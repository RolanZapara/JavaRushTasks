package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("add1");
        arrayList.add("add2");
        arrayList.add("add3");
        arrayList.add("add4");
        arrayList.add("add5");
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
