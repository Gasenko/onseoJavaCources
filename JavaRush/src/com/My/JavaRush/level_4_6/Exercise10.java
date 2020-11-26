package com.My.JavaRush.level_4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        //int max = a < b ? a : b;
        System.out.println(Math.max(Math.max(a,b), Math.max(c,d)));

    }
}
/*
Ввести с клавиатры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Для 4х чисел сначала исключаем равенство a == b && b == c && c == d,
затем последовательно проверка на максимум для a,b,c b если нет, то d max   по аналогии: a >= b && a >= c && a >= d.

Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна выводить максимальное из четырех целых чисел;
- Если максимальных чисел несколько, необходимо вывести любое из них.
 */


