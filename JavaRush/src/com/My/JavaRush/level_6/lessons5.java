package com.My.JavaRush.level_6;

public class lessons5 {


}
/*
Кот и статика

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}

/*
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран
 */
/*
Классовый счетчик

private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {

        }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lessons5 {
/*
Чётные и нечётные циферки

//public class Solution {

        public static int even;
        public static int odd;

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(reader.readLine());
            while (count > 0) {
                if (count % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                count = count / 10;
            }

            System.out.println("Even: " + even + " Odd: " + odd);
        }
}
/*
Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1
Требования:
- програма должна считывать данные с клавиатуры;
- метод main должен подсчитать сколько четных цыфр во введенном числе
  и записать это количество в переменную even.
- метод main должен подсчитать сколько нечетных цыфр во введенном числе
  и записать это количество в переменную odd.
- програма должна выводить текст на екран;
- выведеннный текст должен соответствовать заданию.

89383344974
 */
/*
Ставим котов на счётчик

//public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }
    protected void finalize() throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}
/*
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
(статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
Требования:
- добавить в класс Cat конструктор без параметров public Cat();
- конструктор класса должен на 1 увеличивать значение переменной catCount;
- добавь в класс Cat метод finalize;
- метод finalize ничего не должен возвращать (тип возвращаемого значения void);
- метод finalize должен уменьшать переменную catCount на 1.
 */

/*
По 50 000 объектов Cat и Dog

//public class Solution {
    public static void main(String[] args) {
            // напишите тут ваш код
        Cat[] cat = new Cat[50000];
        for (int i = 0; i < 50000; i++) {
            cat[i] = new Cat();
        }
        Dog[] dog = new Dog[50000];
        for (int i = 0; i < 50000; i++) {
            dog[i] = new Dog();
        }
    }
}
class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}

/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
Требования:
- в классе Cat должен быть void метод finalize;
- в классе Dog должен быть void метод finalize;
- метод Cat должен выводить на экран "A Cat was destroyed".
- метод Dog должен выводить на экран "A Dog was destroyed".
- метод main должен создать 50000 обэктов типа Cat и 50000 обектов типа Dog.
 */

/*
Пустые кошки, пустые псы

//public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    //напишите тут ваш код

}

    class Dog {
        //напишите тут ваш код

        protected void finalize() throws Throwable {
            System.out.println("A Dog was destroyed");
    }
}

/*
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том,
что такой-то объект уничтожен.

 */


/*
Метод finalize класса Cat

public class Cat {
    //напишите тут ваш код
    protected void finalize() throws Throwable{
    }
    public static void main(String[] args) {

    }
}
 */
/*
В классе Cat создать метод protected void finalize() throws Throwable.
 */