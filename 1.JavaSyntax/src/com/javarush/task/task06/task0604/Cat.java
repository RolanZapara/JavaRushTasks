package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    //напишите тут ваш код

    public Cat() {
        catCount = catCount + 1;
    }

    @Override
    protected void finalize() throws Throwable {
        catCount = catCount - 1;
        //        super.finalize();
    }

    public static void main(String[] args) {

    }
}