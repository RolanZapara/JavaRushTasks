package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        System.out.println(Cat.getCatCount());
        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int getCatCount() {
            return catCount;
        }

        // Создай статическую переменную catCount
        public static int catCount;

        public Cat() {
            Cat.catCount = catCount + 1;
        }
        // Создай конструктор
    }
}
