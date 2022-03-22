package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {
        cat.setName("name");
        System.out.println(cat.getName().toString());
    }

    static class Cat {
        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        static {
            Cat cat = new Cat();
        }
    }
}
