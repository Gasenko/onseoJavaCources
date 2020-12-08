package com.My.JavaRush.level_4_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lessons0404 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int d = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + y + "." + m + "." +d + ".");

    }
}
/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
Требования:
- програма должна считывать строки с клавиатуры;
- програма должна выводить строки на экран;
- програма должна выводить текст шаблон которого указан в задании;
- каждое предложение вывести с новой строки.
 */
