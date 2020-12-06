package com.My.JavaRush.level_4_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int i = 0;

        for (i=1; i<=10; i++){
            System.out.println(string + " любит меня.");
        }
    }
}

/*
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
Пример вывода на экран для имени Света:
Света любит меня.
Требования:
- програма должна считівать имя см клавиатурі
- програма должна віводить текст на єкран
- програма должна выводить 10 раз текст указаный в задании
- в програме должен использоваться цикл for.
 */