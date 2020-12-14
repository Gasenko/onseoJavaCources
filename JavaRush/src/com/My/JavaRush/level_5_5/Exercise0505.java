package com.My.JavaRush.level_5_5;
//Кошачья бойня
public class Exercise0505 {

        public static void main(String[] args) {
            //напишите тут ваш код
            Cat cat1 = new Cat("Cupcake", 2, 2, 2);
            Cat cat2 = new Cat("Jasper", 2, 2, 2);
            Cat cat3 = new Cat("Apollo", 3, 3, 3);

            System.out.println(cat1.fight(cat2));
            System.out.println(cat1.fight(cat3));
            System.out.println(cat2.fight(cat3));
        }

        public static class Cat {

            protected String name;
            protected int age;
            protected int weight;
            protected int strength;

            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }

            public boolean fight(Cat anotherCat) {
                int ageScore = Integer.compare(this.age, anotherCat.age);
                int weightScore = Integer.compare(this.weight, anotherCat.weight);
                int strengthScore = Integer.compare(this.strength, anotherCat.strength);

                int score = ageScore + weightScore + strengthScore;
                return score > 0; // return score > 0 ? true : false;
            }
        }
}



/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
Требования:
- програма не должна считывать даные с клавиатуры;
- нужно создать три обэкта типа Cat;
- нужно провести три боя;
- програма должна вывести результат каждого боя с новой строки.

*/
