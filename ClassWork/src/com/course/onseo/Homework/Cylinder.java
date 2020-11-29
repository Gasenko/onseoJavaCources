package com.course.onseo.Homework;

public class Cylinder extends Circle{
    protected double height;

    public Cylinder()
    {
        setHeight(0);
    }

    public Cylinder(double h, double r, int a, int b)
    {
        super((int) r,a,b);
        setHeight(h);
    }

    public void setHeight(double h)
    {
        if (h >= 0)
            height = h;
        else
            height = 0;
    }

    public double getHeight()
    {
        return height;
    }

    public double area()
    {
        return 2 * super.area() + (2 * Math.PI * radius * height);
    }

    public double volume()
    {
        return super.area() * height;
    }

    public String toString()
    {
        return super.toString() + "; Height = " + height;
    }
}
