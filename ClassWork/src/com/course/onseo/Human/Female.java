package com.course.onseo.Human;
public class Female {
    private String type;
    private String name;
    private int age;
    public Female(){
        name = "Василина";
        age = 21;
        type = "Female";
    }

    public Female(String name, String type, int age){
        this.name = name;

        if (age > 0 && age > 100){
            this.age = age;}
    }
    public String getNameFemale(){return name;}
    public int getAgeFemale(){return age;}
    public String getTypeFemale(){return type;}

    public void setAgeFemale (int age){
        if (age>0 && age >100){
            this.age = age;}
    }
    public void setNameFemale (String name){
        if (name.isBlank())
            this.name = name;}
    public void setTypeFemale(String type){
        if (type.isBlank())
            this.type = type;}

    public void sayFemale (){System.out.println("Привіт пісюни");}
    public void walkFemale (){System.out.println("Пішла гуляти бо за@балася");}
}