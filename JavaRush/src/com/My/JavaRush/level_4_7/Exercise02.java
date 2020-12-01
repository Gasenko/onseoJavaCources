package com.My.JavaRush.level_4_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {
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
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }

}
/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и
количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
Пример:
а) при вводе чисел  2 5 6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример:
б) при вводе чисел -2 -5 6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна віводить количество отрицательных чисел в исходном наборе.
- Програма должна віводить количество положительных чисел в исходном наборе.
- Если отрицательных чисел нет, програма должна вывести - "количество отрицательных чисел: 0"
- Если положительных чисел нет, програма должна вывести - "количество положительных чисел: 0"
- Учесть что число 0 не относится ни к положительным ни к отрецательным числам.

*/