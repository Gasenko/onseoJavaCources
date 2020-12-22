package com.course.onseo.Less1712HW;

import java.util.Arrays;
import static java.lang.Math.random;

public class GroupWeight {
    private People[] peoples;

    public void newPeoples(int count) {
        peoples = new People[count];
    }

    public void initPeoples() {
        if (peoples != null) {
            for (int i = 0; i < peoples.length; i++) {
                peoples[i] = new People(new String((char) (97 + i) + ""),
                        (int) (random() * 100),
                        peoples.length % (i + 1) != 0);
            }
        }
    }

    public void sortUsers(){
        Arrays.sort(peoples);
    }

    public void showPeoples(){
        if (peoples!=null){
            for (int i=0; i < peoples.length; i++){
                System.out.println(peoples[i].toString());
            }
        }
    }

}