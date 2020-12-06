package com.My.JavaRush.level_4_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if ((a>1) && (a<10) && (a%2==0))
            System.out.println("четное однозначное число");
        if ((a>=1) && (a<10) && ((a%2!=0)))
            System.out.println("нечетное однозначное число");
        if ((a>=10) && (a<100) && (a%2==0))
            System.out.println("четное двузначное число");
        if ((a>=10) && (a<100) && ((a%2!=0)))
            System.out.println("нечетное двузначное число");
        if ((a>=100) && (a<1000) && (a%2==0))
            System.out.println("четное трехзначное число");
        if ((a>=100) && (a<1000) && ((a%2!=0)))
            System.out.println("нечетное трехзначное число");
}
}
/*
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100: "четное трехзначное число"
Пример для числа 51: "нечетное двузначное число"
Требования:
- Програма должна считывать числа с клавиатуры;
- Програма должна выводить число на экран;
- Програма должна выводить только строку описания и больше ничего.
- Если число четное и имеет одну цифру вывести "четное однозначное число"
- Если число четное и имеет две цифры вывести "четное двузначное число"
- Если число четное и имеет три цифры вывести "четное трехзначное число"
- Если число нечетное и имеет одну цифру вывести "нечетное однозначное число"
- Если число нечетное и имеет две цифры вывести "нечетное двузначное число"
- Если число нечетное и имеет три цифры вывести "нечетное трехзначное число"
- Если введенное число не попадает в диапазон 1-999 ничего нее выводить на экран.
* */