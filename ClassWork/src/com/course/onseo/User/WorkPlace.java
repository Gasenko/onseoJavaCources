package com.course.onseo.User;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkPlace {
    private User[]users;

    public void createUsers(int count){
        users = new User[count];
    }
    public void initUsers(){
        if (users!=null){
            for (int i = 0; i < users.length; i++) {
                users[i] = new User(new String((char)(97+i)+""),
                                    (int)(Math.random()*15+18),
                                    users.length%(i+1)!=0);
            }
        }
    }
    public void sortUsers(){
        Arrays.sort(users);
    }

    public void showUsers(){
        if (users!=null){
            for (int i=0; i < users.length; i++){
                System.out.println(users[i].toString());
            }
        }
    }
}
