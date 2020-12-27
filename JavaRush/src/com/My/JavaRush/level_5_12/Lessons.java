package com.My.JavaRush.level_5_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lessons {
/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/
//public class Solution {
    public static void main(String[] args) throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int number = Integer.parseInt(reader.readLine());

        if (number <= 0) {
            return;
        }
        int[] data = new int[number];
        for (int i = 0; i < number; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < number; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }
    }
}
/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

 */

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lessons {
/*
Совершенствуем функциональность

//public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }
    public static int min(int a, int b, int c, int d, int e) {
        return min(min(a, b), min(min(c, d), e));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
/*
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

 */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lessons {
/*
Шеф, что-то не пашет


//    public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            int sum = a + b;
            System.out.println("Sum = " + sum);
        }

}
/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
 */

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lessons {
/*
Консоль-копилка

//public class Solution {
    public static void main(String[] args) throws Exception {
            //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String command = reader.readLine();
            if (command.equals("сумма")) {
                System.out.println(sum);
                return;
            }
            int number = Integer.parseInt(command);
            sum += number;
        }

    }
}
/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка,
например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
 */

/*
Том и Джерри


//public class Solution {
    public static void main(String[] args) {
         Mouse jerryMouse = new Mouse("Jerry", 12, 5);
         Cat tomasCat = new Cat("Tomas", 25, 45);
         Dog jackDog = new Dog("Jack", 35, 15);

            //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
         }
    }
    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

        //напишите тут ваш код

}
/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
 */

/*
Мужчина и женщина


//public class Solution {
    public static void main(String[] args) {
            //напишите тут ваш код
        Man man1 = new Man("Vasja", 35, "Port");
        Man man2 = new Man("Vova", 25, "Avenue");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println();
        Woman woman1 = new Woman("Sofia", 8, "Port");
        Woman woman2 = new Woman("Maria", 4, "Avenue");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }
        //напишите тут ваш код
    public static class Man{
            String name;
            int age;
            String address;

            public Man(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
Требования:
- в классе Solution создай public static  класс Man;
- классе Solution создай public static класс Woman;
- клас Man должен содержать переменные: name (String), age (int), address (String);
- клас Woman должен содержать переменные: name (String), age (int), address (String);
- у классов Man and Woman должны быть конструкторы принимающие параметры с типами String, int, String;
- конструкторы должны инициализироватьпеременные класса;
- в методе main необходимо создать по два обекта каждого типа;
- метод main должен выводить созданные обекты на экран в указаном формате.
  */





    /*
И целой утки мало


//public class Solution {

        public static void main(String[] args) {
            Duck duck1 = new Duck();
            Duck duck2 = new Duck();
            System.out.println(duck1);
            System.out.println(duck2);
            //напишите тут ваш код
            System.out.println();
            Cat cat1 = new Cat();
            Cat cat2 = new Cat();
            System.out.println(cat2);
            System.out.println(cat1);
            System.out.println();
            Dog dog1 = new Dog();
            Dog dog2 = new Dog();
            System.out.println(dog2);
            System.out.println(dog1);
        }

        public static class Duck {
            public String toString() {
                return "Duck";
            }
        }
        //напишите тут ваш код
        public static class Cat{
            public String toString() {
                return "Cat";
            }
        }
        public static class Dog{
            public String toString() {
                return "Dog";
            }
        }


}

/*
По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
Требования:
- создать класс Саt;
- создать класс Dog;
- у класса Cаt должен быть верно реализован метод toString;
- у класса Dog должен быть верно реализован метод toString;
- в методе main создай два обекта типа Cat;
- в методе main создай два обекта типа Dog;
- Выведи все созданные обекты на экран.
 */


/*
import java.text.SimpleDateFormat;

import java.util.Date;

public class Lessons {
/*
Вывести на экран сегодняшнюю дату

//public class Solution {
        public static void main(String[] args) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            System.out.println(simpleDateFormat.format(new Date()));
        }
    }

*/