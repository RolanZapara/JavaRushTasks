package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name; //null
    int age;
    int weight;
    String address; //null
    String color;

    int middleAge = 5;
    int middleWeight = 20;

    public Cat(String name) { //except address
        this.name = name;
        this.age = middleAge;
        this.weight = middleWeight;
        this.color = name;
    }

    public Cat(String name, int weight, int age) { //except address
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = name;
    }

    public Cat(String name, int age) { //except address
        this.name = name;
        this.age = age;
        this.weight = middleWeight;
        this.color = "black";
    }

    public Cat(int weight, String color) { //except name & address
        this.age = middleAge;
        this.weight = weight;
        this.color = color;

    }

    public Cat(int weight, String color, String address) { //except name
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = middleAge;
    }

    public static void main(String[] args) {

    }
}
