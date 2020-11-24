package com.course.onseo.Annimal;

public class Annimal {
    private int age;
    private double weight;
    private String color;
    private String type;

    public Annimal(int age, double weight, String color, String type) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
