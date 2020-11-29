package com.My.JavaRush.level_4_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPositive = 0;
        int countNegative = 0;

        if (a>0){
            countPositive++;
        } else if (a<0){
            countNegative++;
        }if (b>0){
            countPositive++;
        } else if (b<0){
            countNegative++;
        }if (c>0){
            countPositive++;
        } else if (c<0){
            countNegative++;
        }

        System.out.println("количество положительных чисел: " + countPositive);
    }

}
/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел -4  6  6; получим вывод - 2
б) при вводе чисел -6 -6 -3; получим вывод - 0
в) при вводе чисел  0  1  2; получим вывод 2
Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна выводить количество положительных чисел в исходном наборе.
- Если положительных чисел нет, програма должна вывести - "количество положительных чисел: 0"
- Учесть что число 0 не относится ни к положительным ни к отрецательным числам.

*/