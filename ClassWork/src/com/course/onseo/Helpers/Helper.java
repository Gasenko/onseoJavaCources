package com.course.onseo.Helpers;

import com.course.onseo.Annimal.Dog;
import com.course.onseo.myArray.MyArray;

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
    public static void print(Object obj){
        System.out.println(obj.toString());
    }

    public static int getInt(MyArray array) throws Exception{
        return array.getIndexOfElement((int) (Math.random()*100));
    }

}
