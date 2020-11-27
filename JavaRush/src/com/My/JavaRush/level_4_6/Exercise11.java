package com.My.JavaRush.level_4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if (number1 <= number2 && number1 <= number3) {
            if (number2 <= number3) {
                System.out.println(number3 + " " + number2 + " " + number1);
            } else {
                System.out.println(number2 + " " + number3 + " " + number1);
            }
        } else if (number2 <= number1 && number2 <= number3) {
            if (number1 <= number3) {
                System.out.println(number3 + " " + number1 + " " + number2);
            } else {
                System.out.println(number1 + " " + number3 + " " + number2);
            }
        } else {
            if (number1 <= number2) {
                System.out.println(number2 + " " + number1 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2 + " " + number3);
            }
        }
    }
}
/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

В сортировке 3х чисел - я сделал 3 метода - max(int a, int b), min(int a, int b), mdl(int a, int b, int c) и вывел на печать:
System.out.println(max(max(a,b),c) + " " + mdl(a,b,c) + " " + min(min(a,b),c));
Решена с первой попытки))

Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить числа на экран;
- Програма должна выводить три чисела разделенных пробелом;
- Програма должна виводить числа в порядке убывания.
 */


