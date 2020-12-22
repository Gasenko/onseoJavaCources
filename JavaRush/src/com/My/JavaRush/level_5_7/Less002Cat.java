package com.My.JavaRush.level_5_7;

public class Less002Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }

    public static void main(String[] args) {

    }

}
/*
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
Требования:
- у класса Cat должна быть пеерменная name с типом String;
- у класса Cat должна быть переменная age с типом int;
- у класса Cat должна быть переменная weight с типом int;
- у класса Cat должна быть переменная address с типом String;
- у класса Cat должна быть переменная color с типом String;
- у класса должен быть метод initialize, принимающий в качестве параметра имя,
  но инициализирующий все переменные классаб кроме адресса.
- у класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст
  и инициализирующий все переменные классаб кроме адресса.
- у класса должен быть метод initialize, принимающий в качестве параметров имя, возраст
  и инициализирующий все переменные классаб кроме адресса.
- у класса должен быть метод initialize, принимающий в качестве параметров вес и цвет
  и инициализирующий все переменные классаб кроме адресса.
- у класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес
  и инициализирующий все переменные классаб кроме имени.
 */
