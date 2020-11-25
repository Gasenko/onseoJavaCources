package com.My.JavaRush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int min = a <b ? a : b;
        System.out.println(min);

        /*
        if (a < b) System.out.println(a);
        else {
            if (b < a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
            }

        }*/
    }
}
/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
- Програма должна считывать две строки с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна выводить минимальное из двух целых чисел;
- Если два числа равны между собой необходимо вывести любое.
 */


