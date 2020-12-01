package com.course.onseo;

import javax.swing.JOptionPane;

import com.course.onseo.Homework.Circle;
import com.course.onseo.Homework.Cylinder;
import com.course.onseo.Homework.Point;

import java.text.DecimalFormat;

public class FigureHomework {

    public static void main( String args[ ]){

        //Point p = new Point(3, 6);
        //System.out.println("X coordinate " + p.getX() + " ; " +"\nY coordinate " + p.getY() + " ; ");

        //Circle c = new Circle(3,5, 5.8);
        //System.out.println("X coordinate " + c.getX() + " ; " +"\nY coordinate " + c.getY() + "\nRadius : " + c.getRadius() + " ; ");

        //System.out.println("Area is " + c.area());

        Cylinder c = new Cylinder(5.7, 2.5, 12, 23);
        DecimalFormat precision2 = new DecimalFormat("0.00");
        //String output;

        //output =
        System.out.println("X coordinate is " + c.getX() +
                "\nY coordinate is " + c.getY() +
                "\nRadius is " + c.getRadius() +
                "\nHeight is " + c.getHeight());

        System.out.println("\n\nThe new location, radius and height of c are\n" + c +
                "\nArea is " + precision2.format(c.area()) +
                "\nVolume is " + precision2.format(c.volume()));

    }
}