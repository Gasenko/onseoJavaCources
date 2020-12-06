package com.My.JavaRush.level_4_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int n = Integer.parseInt (reader.readLine());

            while (n > 0) {
                System.out.println(string);
                n--;
            }
    }
}
/*Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
Требования:
- програма должна считывать текст с клавиатуры
- програма должна выводить текст на экран
- каждое значение должно быть выведено с новой строки
- програма должна выводить на экран строку N раз
- в програме должен использоватся цикл while.

*/



