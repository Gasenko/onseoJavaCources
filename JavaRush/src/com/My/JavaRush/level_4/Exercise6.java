package com.My.JavaRush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        if (age < 18){
            System.out.println("Need to grow Up ))))");
        }
    }
}

