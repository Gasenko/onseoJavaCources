package com.course.onseo;

import com.course.onseo.Annimal.Dog;
import com.course.onseo.Helpers.Helper;

public class Lessons19112020 {

    public static void main(String[] args) {
        Dog bars = new Dog();
        bars.setAge(-999);
        bars.setName("Bars");
        bars.setType("Zloberman");

        System.out.println("bars age = " + bars.getAge());
        System.out.println("bars name = " + bars.getName());
        System.out.println("bars type = " + bars.getType());

        bars.walk();

        //System.out.println(Helper.isDogOld(bars));

    }
}
