package com.course.onseo;

import com.course.onseo.Annimal.Cat;
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

        System.out.println();
        System.out.println();
        System.out.println();

        Dog a = new Dog("asdf", "asfdsdf", 12);
        Cat b = new Cat("asdf", "asfdsdf", 12);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

    }




}
