package com.My.JavaRush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int min = a < d ? a : d;
        System.out.println(min);

    }
}
/*

Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна выводить максимальное из четырех целых чисел;
- Если максимальных чисел несколько, необходимо вывести любое из них.
 */


