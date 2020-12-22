package com.My.JavaRush.level_5_7;

public class Less005Rectangle {
    public int left;
    public int top;
    public int width;
    public int height;

    public void initialize(int left) {
        this.left = left;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
Требования:
- програма не должна считывать данные с клавиатуры;
- у класса Rectangle должэны быть переменные left, top, width, height
- у класса должен быть хотябы один метод initialize
- у класса должен быть хотябы два метода initialize
- у класса должен быть хотябы три метода initialize
- у класса должен быть хотябы четыре метода initialize
 */