package com.My.JavaRush.level_4_10;

public class Exercise06 {
    public static void main(String[] args) {
        // Выводим значения второго множителя в строке
        System.out.println(" 1 2  3  4  5  6  7  8  9");
        int i = 2;
        while(i<10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j<10) {
                int mul=i*j;
                if (mul<10)
                    System.out.print(mul + "  ");
                else
                    System.out.print(mul + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }


}
/*Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
Требования:
- програма должна считывать текст с клавиатуры
- програма должна выводить текст на экран
- каждое значение должно быть выведено с новой строки
- програма должна выводить на экран строку N раз
- в програме должен использоватся цикл while.

*/


