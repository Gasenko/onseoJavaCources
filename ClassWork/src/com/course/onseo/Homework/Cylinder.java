package com.course.onseo.Homework;

public class Cylinder extends Circle{
    protected double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, int i, int height1) {
        super(radius);
        this.height = height;
    }

    public Cylinder(int a, int b, double radius, double height) {
        super(a, b, radius);
        this.height = height;
    }

    public double area (){
        return 2 * super.area() + (2*Math.PI * getRadius() * height);
    }

    public double volume(){
        return super.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}

