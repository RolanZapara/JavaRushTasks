package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String color;
    String address;

    int standardAge = 5;
    int standardWeight = 5;
    String standardColor = "white";

    //TODO name & address could be null
    //todo SET WEIGHT, AGE, COLOR

    public void initialize(String name) { //TODO EXCEPT ADDRESS
        this.name = name;
        this.age = standardAge;
        this.weight = standardWeight;
        this.color = standardColor;
    }

    public void initialize(String name, int weight, int age) { //TODO EXCEPT ADDRESS
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = standardColor;
    }

    public void initialize(String name, int age) { //TODO EXCEPT ADDRESS
        this.name = name;
        this.age = age;
        this.weight = standardWeight;
        this.color = standardColor;
    }

    public void initialize(int weight, String color) { //TODO EXCEPT ADDRESS & NAME
        this.age = standardAge;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) { //TODO EXCEPT NAME
        this.age = standardAge;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}
