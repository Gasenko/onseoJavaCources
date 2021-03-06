package com.My.JavaRush.level_4_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lessons0403 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i = 0; ; i++)

        {
            int a = Integer.parseInt(reader.readLine());
            sum = a + sum;

            if(a == -1)
            {
                System.out.println(sum);
                break;
            }
        }
    }
}
/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
- програма должна считывать числа с клавиатуры;
- если пользователь ввел -1, програма должна вывести суму все введеных чисел на экран и завершиться;
- програма должна посчитать сумму введенных чисел и вывести ее на экран;
- в програм е должен использоваться цикл for, while или do-while.
 */