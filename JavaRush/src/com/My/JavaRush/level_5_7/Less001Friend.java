package com.My.JavaRush.level_5_7;

public class Less001Friend {
    /*
Создать класс Friend
*/

//    public class Friend {
        public String name;
        public int age;
        public char sex;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void initialize(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public static void main(String[] args) {

        }
}
/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).

 */