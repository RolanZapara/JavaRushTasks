package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.left = rectangle.getLeft();
        this.top = rectangle.getTop();
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    /**
     *  заданы 4 параметра: left, top, width, height
     * - ширина/высота не задана (оба равны 0)
     * - высота не задана (равно ширине) создаём квадрат
     * - создаём копию другого прямоугольника (он и передаётся в параметрах)
     */



    public static void main(String[] args) {

    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
