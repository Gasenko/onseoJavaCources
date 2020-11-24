package com.My.JavaRush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a>0 && b>0){
            System.out.println("Точка в " + 1 + " чверті координат");
        }else if (a<0 && b>0){
            System.out.println("Точка в " + 2 + " чверті координат");
        }else if (a<0 && b<0){
            System.out.println("Точка в " + 3 + " чверті координат");
        }else if (a>0 && b<0){
            System.out.println("Точка в " + 4 + " чверті координат");
        }
    }
}

