package com.My.JavaRush.level_4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();


        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length())
            System.out.println("Длины имен равны");
    }
}
/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.
Требования:
Програма должна считывать две строки с клавиатуры;
Пограма должна использовать команды System.out.println;
- Если имена одинаковы вывестити сообщение "Имена идентичны";
- Если имена разные но их длины равны вывести сообщение "Длины имен равны";
- Если имена и длины имен разные ничего не выводить.

 */


