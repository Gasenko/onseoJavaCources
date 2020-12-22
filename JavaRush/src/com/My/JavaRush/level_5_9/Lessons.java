package com.My.JavaRush.level_5_9;
/*
Основа колеса


public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}



/*
Конструктор


public class Circle {
    public Color color;

    public Circle() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

/*
Максимум конструкторов

public class Circle {
    public double x;
    public double y;
    public double radius;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Circle() {  //колнструктор по замовченню
    }

    public Circle(double x) {
        this.x = x;
    }
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public static void main(String[] args) {

    }
}

/*
Вызов конструктора из конструктора

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }

}

/*
public class Rectangle {
    public int left;
    public int top;
    public int width;
    public int height;

    public Rectangle(int left) {
        this.left = left;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
}

public class Circle{
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}

public class Dog {
    private String name;
    private int height;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}

public class Lessons {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Lessons(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Black";
    }

    public Lessons(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public Lessons(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Black";
    }

    public Lessons(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Lessons(int weight, String address, String color) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }
}

public class Lessons {
    public String name;
    public int age;
    public char sex;

    public Lessons(String name) {
        this.name = name;
    }
    public Lessons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Lessons(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
*/
