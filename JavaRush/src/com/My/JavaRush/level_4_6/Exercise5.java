package com.My.JavaRush.level_4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        if (age > 20){
            System.out.println("18 to much");
        }
    }
}

