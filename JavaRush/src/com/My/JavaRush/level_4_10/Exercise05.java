package com.My.JavaRush.level_4_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {
    public static void main(String[] args){
        int i = 0;

        while (i<10){
            int j = 0;
            while (j<10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
Требования:
- програма не должна считывать текст с клавиатуры
- програма должна выводить текст на экран
- програма должна выводить квадрат из 10х10 букв S
- в програме должен использоватся цикл while.
*/



