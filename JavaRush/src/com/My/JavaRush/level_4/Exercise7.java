package com.My.JavaRush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if(b==c) System.out.println(1);
        else if(a==c) System.out.println(2);
        else if(a==b) System.out.println(3);
        }
}
/*
ВВести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между осбой.
Вывестина экран порядковый номер числа, отличного от остальных.
пример: ввод 466 вывод 1
             663       3
Требования:
Програма должна считывать числа с клавиатуры;
Пограма должна использовать команды System.out.println;
Програма должна выводить на экран порядковый номер числа отличного от остальных;
Если все числа разные ничего не выводить.

 */


