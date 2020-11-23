package com.course.onseo;
import com.course.onseo.Human.Female;
import com.course.onseo.Human.Male;
public class HumanHW {


    public static void main(String[] args) {
        Male male = new Male();
        Female female = new Female();

        System.out.println();
        System.out.println(male.getNameMale());
        System.out.println(female.getNameFemale());
        System.out.println(male.getAgeMale());
        System.out.println(female.getAgeFemale());
        System.out.println(female.getTypeFemale());
        System.out.println(male.getTypeMale());

        male.walkMale();
        female.walkFemale();
        System.out.println();
        //if (gender == male){
        male.sayMale();
        //} else {
        female.sayFemale();
        //}
    }

}
