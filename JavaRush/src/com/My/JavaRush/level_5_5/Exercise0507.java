package com.My.JavaRush.level_5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise0507 {
    public static void main(String[] args) throws IOException {
        BufferedReader meadle = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        float res = 0;
        int count = 0;

        for(int i = 1; i!=(-1); i++)
        {
            int a = Integer.parseInt(meadle.readLine());
            if(a == -1){
               break;
            }
            sum = a + sum;
            count++;
            res=(float)sum/count;
        }
        System.out.println(res);
    }
}


/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Примеры:
а) при вводе чисел: 1.2.2.4.5.-1
получим вывод: 2.8
б) при вводе чисел: 4.3.2.1.-1
получим вывод: 2.5
Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
- програма должна считывать данные с клавиатуры;
- програма должна выводить данные на экран;
- после ввода -1 програма должна коректно завершить роботу;
- если последоватедльно ввести: 1.2.2.4.5 и -1 програма должна вывести 2.8;
- если последовательно ввести: -100.0.100 и -1 програма должна вывести 0.0
- если последовательно ввести: 1 и -1 програма должна вывести 1.0;
- выведенные резурьтат должен соответствовать заданию для любых входных даных.
*/
