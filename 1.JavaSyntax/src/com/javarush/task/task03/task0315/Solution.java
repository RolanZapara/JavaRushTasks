package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Red red = new Red();
//        System.out.println(red);
        Orange orange = new Orange();
//        System.out.println(orange);
        Yellow yellow = new Yellow();
//        System.out.println(yellow);
        Green green = new Green();
//        System.out.println(green);
        Blue blue = new Blue();
//        System.out.println(blue);
        Indigo indigo = new Indigo();
//        System.out.println(indigo);
        Violet violet = new Violet();
//        System.out.println(violet);
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
