package com.course.onseo.Human;
public class Male {
    private String type;
    private String name;
    private int age;
    public Male(){
        name = "Васьок";
        age = 35;
        type = "Male";
    }
    public Male(String name, String type, int age){
        this.name = name;
        if (age > 0 && age > 100){
            this.age = age;}
    }
    public String getNameMale(){return name;}
    public int getAgeMale(){return  age;}
    public String getTypeMale(){return type;}

    public void setAgeMale(int age){
        if (age>0 && age >100){
            this.age = age;}
    }
    public void setNameMale(String name) {
        if (name.isBlank())
            this.name = name;
    }
    public void setTypeMale(String type) {
        if (type.isBlank())
            this.type = type;
    }

    public void sayMale(){ System.out.println("Дарова Братва");}
    public void walkMale(){System.out.println("Пішов на пивасік");}
}