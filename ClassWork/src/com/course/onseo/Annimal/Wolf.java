package com.course.onseo.Annimal;

public class Wolf extends Annimal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wolf(int age, double weight, String color, String type) {
        super(age, weight, color, type);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                '}';
    }
}
