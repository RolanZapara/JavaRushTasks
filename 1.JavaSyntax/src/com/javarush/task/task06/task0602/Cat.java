package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    public Cat() {
    }

    //напишите тут ваш код
    public void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код

    public Dog() {
    }

    public void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }
}
