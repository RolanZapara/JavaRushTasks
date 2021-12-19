package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private String name;
        private boolean blackHairColor;
        private String skinColor;
        private long numberSistersBrothers;

        public Human(String name, boolean blackHairColor, String skinColor, long numberSistersBrothers) {
            this.name = name;
            this.blackHairColor = blackHairColor;
            this.skinColor = skinColor;
            this.numberSistersBrothers = numberSistersBrothers;
        }

        public Human(boolean blackHairColor, String skinColor, long numberSistersBrothers) {
            this.blackHairColor = blackHairColor;
            this.skinColor = skinColor;
            this.numberSistersBrothers = numberSistersBrothers;
        }

        public Human(String skinColor, long numberSistersBrothers) {
            this.skinColor = skinColor;
            this.numberSistersBrothers = numberSistersBrothers;
        }

        public Human(int age, int weight, String name, boolean blackHairColor, String skinColor, long numberSistersBrothers) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.blackHairColor = blackHairColor;
            this.skinColor = skinColor;
            this.numberSistersBrothers = numberSistersBrothers;
        }

        public Human(int age, int weight, String name, boolean blackHairColor, String skinColor) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.blackHairColor = blackHairColor;
            this.skinColor = skinColor;
        }

        public Human(int age, int weight, String name, boolean blackHairColor) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.blackHairColor = blackHairColor;
        }

        public Human(int age, int weight, String name) {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human() {
        }
    }
}
