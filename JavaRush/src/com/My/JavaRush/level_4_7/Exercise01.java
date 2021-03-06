package com.My.JavaRush.level_4_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a < 0 && a % 2 == 0){
            System.out.println("отрицательное четное число");
        } else if (a<0 && a % 1==0){
            System.out.println("отрицательное нечетное число");
        } else if (a==0){
            System.out.println("ноль");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (a > 0 && a % 1 == 0) {
            System.out.println("положительное нечетное число");
        }
    }
}


/*
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.
Пример для числа 100: положительное четное число
Пример для числа -51: отрицательное нечетное число
Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Если число отрицательное и четное, вывенсти "отрицательное четное число";
- Если число отрицательное и нечетное, вывенсти "отрицательное нечетное число";
- Если число равно 0, вывенсти "ноль";
- Если число положительное четное, вывенсти "положительное четное число";
- Если число положительное нечетное, вывенсти "положительное нечетное число";
*/