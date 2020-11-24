package com.course.onseo.Annimal;

import java.util.Objects;

public class Cat {
    private String name;
    private String type;
    private int age;

    public Cat(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Cat(String name) {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(type, cat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age);
    }
}
