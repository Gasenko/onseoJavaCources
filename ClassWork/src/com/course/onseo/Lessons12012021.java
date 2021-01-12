package com.course.onseo;

import java.util.*;

public class Lessons12012021 {

    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("a",1);
        list.put("b",9);
        list.put("c",4);
        list.put("d",8);
        list.put("e",7);
        list.put("f",2);
        list.put("g",3);
        list.put("h",5);
        list.put("y",6);
        list.put("z",9);
        list.put("a",0);
        list.put("w",null);
        list.put(null,null);

        Set<String> strings = list.keySet();
        for (String string : strings
             ) {
            System.out.println(string + " : " + list.get(string));
        }
/*
        System.out.println(list.keySet().contains("x"));

        System.out.println(list.get("w"));
        System.out.println("size= " + list.size());


        System.out.println(list);
        System.out.println();
        //System.out.println(list.get(3));
        System.out.println("size= " + list.size());
        System.out.println();

        for (Integer string : list) {
            System.out.print(string + " ");
            */



    }
}
