package com.course.onseo.Helpers;

import com.course.onseo.Annimal.Dog;

public class Helper {
    private static final  int oldDogAge = 10;

    public static boolean isDogOld(Dog dog){
        count++;
        return dog.getAge()>oldDogAge;
    }
    private static int count = 0;

    public int getCount(){
        return count;
    }

}
