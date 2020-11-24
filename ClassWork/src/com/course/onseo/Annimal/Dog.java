package com.course.onseo.Annimal;

public class Dog {
    private String name;
    private String type;
    private int age;

    public Dog(){
        name = "No Name";
        type= "Chihua-Nihua";
        age = 1;
    }


    public Dog(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (!name.isBlank())
            this.name =name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age>=0 && age <=21)
            this.age = age;
    }

    public void sayGaf(){
        System.out.println("Gaf-Gaf-Gaf. Rrrrrrrrrrr");
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        if (type.isBlank())
            this.type = type;
    }

    public void walk(){
        System.out.println("Dog going walk!");
    }
}
