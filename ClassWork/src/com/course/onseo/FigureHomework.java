package com.course.onseo;

import javax.swing.JOptionPane;

import com.course.onseo.Homework.Circle;
import com.course.onseo.Homework.Point;

public class FigureHomework {

    public static void main( String args[ ]){

        //Point p = new Point(3, 6);
        //System.out.println("X coordinate " + p.getX() + " ; " +"\nY coordinate " + p.getY() + " ; ");

        Circle c = new Circle(3,5, 5.8);
        System.out.println("X coordinate " + c.getX() + " ; " +"\nY coordinate " + c.getY() + "\nRadius : " + c.getRadius() + " ; ");

        System.out.println("Area is " + c.area());

    }
}