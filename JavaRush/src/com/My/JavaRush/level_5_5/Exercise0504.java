package com.My.JavaRush.level_5_5;
//Трикотаж
                                                  
                                                  
public class Exercise0504 {
    public static void main(String[] args) {                                                  
        Cat cat1 = new Cat("Tom", 2, 2, 2);                                                  
        Cat cat2 = new Cat("Sam", 2, 2, 2);                                                  
        Cat cat3 = new Cat("Fiona", 3, 3, 3);                                                  
    }                                                  
                                                  
    public static class Cat {                                                  
        private String name;                                                  
        private int age;                                                  
        private int weight;                                                  
        private int strength;                                                  
                                                  
        public Cat(String name, int age, int weight, int strength) {                                                  
            this.name = name;                                                  
            this.age = age;                                                  
            this.weight = weight;                                                  
            this.strength = strength;                                                  
        }                                                  
    }                                                  
}
/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. 
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. 
Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
Требования:
- програм ане должна считывать даные с клавиатуры;
- нужно создать три обьекта типа Cat.
- класс Cat нельзя изменять;
- програм ане должна выводить даные на экран.
*/
