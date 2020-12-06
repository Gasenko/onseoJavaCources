package com.My.JavaRush.level_4_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int x = 1; x <= m; x++) {
            for (int i = 2; i <= n; i++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
Требования:
- програма не должна считывать два числа с клавиатуры;
- програма должна выводить текст на екран;
- програма должна выводить прямоугольник размером М на Н из восьмерок;
- в програме должен использоваться цикл for.
 */