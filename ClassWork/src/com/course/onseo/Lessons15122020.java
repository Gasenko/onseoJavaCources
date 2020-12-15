package com.course.onseo;

import com.course.onseo.myArray.MyArray;
import com.course.onseo.myArray.MyArray2;

import java.io.FileReader;

public class Lessons15122020 {
    public static void main(String[] args) {
        MyArray2 array = new MyArray2(2);
        array.randomize();
        for (int i = -10; i <= array.getLength(); i++) {
            try {
                System.out.print(array.getElement(i) + " ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
            //finally {
            //    System.out.println("By-ga-ga-go");
            //}

        }

        //FileReader a = new FileReader("testing");
        //System.out.println(array.getElement(10));

    }

}
