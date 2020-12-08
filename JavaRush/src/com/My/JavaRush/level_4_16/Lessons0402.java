package com.My.JavaRush.level_4_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lessons0402 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = a+b+c - Math.max(Math.max(a,b),c) - Math.min(Math.min(a,b),c);
        System.out.println(x);
    }
}
/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
ТребованияЖ
- програма должна считывать числа с клавиатуры;
- програма должна выводить текст на экран;
- програма должна выводить среднее из трех чисел;
- если все числа равны, вывести любое из них;
- если два числа из трех равны, вывести любое из двух.
 */
