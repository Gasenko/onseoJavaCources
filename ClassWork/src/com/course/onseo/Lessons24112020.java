package com.course.onseo;

import com.course.onseo.Annimal.Cat;
import com.course.onseo.Annimal.Dog;
import com.course.onseo.Annimal.Wolf;
import com.course.onseo.Helpers.Helper;

public class Lessons24112020 {
    public static void main(String[] args) {

        //Dog a = new Dog("asdf", "asfdsdf", 12);
        //Cat b = new Cat("asdf", "asfdsdf", 12);
        //System.out.println(a.equals(b));
        //System.out.println(a.hashCode() == b.hashCode());

        Dog a = new Dog();
        Wolf b = new Wolf(12, 36.96, "White&Black", "North");
        //System.out.println(a.equals(b));
        //System.out.println(a.hashCode() == b.hashCode());
        Helper.print(a);
        Helper.print(b);
    }
}
