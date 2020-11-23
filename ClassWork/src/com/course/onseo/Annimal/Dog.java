package com.course.onseo.Annimal;

public class Dog {
    private String type;
    private String name;
    private int age;

    public Dog(){
        name = "No Name";
        age = 1;
        type = "Chihua-Nihua";
    }
    public Dog(String name, String type, int age){
        this.name = name;

        if (age>0 && age >21){
            this.age = age;}
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        if (age>0 && age >21){
            this.age = age;}
    }
    public void setName(String name) {
        if (name.isBlank())
            this.name = name;
    }
    public void setType(String type) {
        if (type.isBlank())
            this.type = type;
    }

    void sayGaf(){
        System.out.println("Gaf-Gaf-Gaf. Rrrrrrrrrrr");
    }
    public void walk(){
        System.out.println("Dog going walk!");
    }
}
