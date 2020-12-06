package com.My.JavaRush.level_4_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {
    public static void main(String[] args){
        for (int x = 1; x <= 10; x++) {
            for (int i = 2; i <= 10; i++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
Требования:
- програма не должна считывать числа с клавиатуры;
- програма должна выводить текст на екран;
- програма должна выводить прямоугольный треугольник из восьмерок со сторонами 10 и 10;
- в програме должен использоваться цикл for.


 */