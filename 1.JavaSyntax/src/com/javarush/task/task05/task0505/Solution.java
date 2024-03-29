package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("VAS_1", 2, 15, 60);
        Cat cat2 = new Cat("VAS_2", 3, 12, 40);
        Cat cat3 = new Cat("VAS_3", 4, 10, 80);

        boolean result1_2 = cat1.fight(cat2);
        System.out.println(result1_2);

        boolean result2_3 = cat2.fight(cat3);
        System.out.println(result2_3);

        boolean result1_3 = cat1.fight(cat3);
        System.out.println(result1_3);

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
