package com.course.onseo;

import com.course.onseo.User.WorkPlace;

public class Lessons17122020 {
    public static void main(String[] args) {
        WorkPlace workPlace = new WorkPlace();
        workPlace.createUsers(20);
        workPlace.initUsers();
        //workPlace.showUsers();
        workPlace.sortUsers();
        System.out.println();
        workPlace.showUsers();
    }
}
