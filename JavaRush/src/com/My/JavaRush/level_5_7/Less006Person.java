package com.My.JavaRush.level_5_7;

public class Less006Person {
  /*
Программист создает человека
*/
//public class Solution {
  public static void main(String[] args) {
      //напишите тут ваш код
      Person person = new Person();
      person.initialize("Den", 35);
  }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize(String name, int age)
        {
            this.name=name;
            this.age=age;
        }

    }
}
/*
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
Вимоги:
- клас Solution повинен мати клас Person;
- у класса Person повинна бути перемінна name з типом String;
- у класса Person повинна бути перемінна age з типом int;
- у класса Person повиннен бути initialize, приймаючий параметри name and age  ініціалізуючий відповідні перемінні класа;
- потрібно створити обєкт типу Person  і занести його ссилку в перемінну Person;
- потрібно визвати метод initialize  у створеного обєкта і передати йому якісь параметри.

*/
