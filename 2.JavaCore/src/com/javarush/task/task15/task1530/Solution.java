package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker t = new TeaMaker();
        t.makeDrink();
        LatteMaker l = new LatteMaker();
        l.makeDrink();
    }
}
